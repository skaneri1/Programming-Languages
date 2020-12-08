(*
 Computes sqrt of a real number x. For a given guess g, one can
 obtain a better guess by averaging the values g and x/g. This
 is repeated until the answer is close enough, ie, within some
 specifed tolerance.
 *)
fun sqrt(x) =
    let
	val tolerance = 0.0001;
	fun goodEnough(guess) = abs(guess * guess - x) <= tolerance;
	fun nextGuess(curGuess) = (curGuess + x / curGuess) / 2.0;
	fun iterate(aGuess) =
	    if goodEnough(aGuess) then aGuess
	    else iterate(nextGuess(aGuess))
    in
	iterate(1.0) (* starting value for a guess *)
    end
