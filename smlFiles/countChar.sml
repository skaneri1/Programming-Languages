(* counts the number of occurrences of character c in string s *)
fun countChar(c, s) =
    if s = "" then 0
    else
	let
	    val fstChar = String.sub(s, 0);
	    val restStr = String.substring(s, 1, size(s) - 1)
	in
	    (if fstChar = c then 1 else 0) + countChar(c,restStr)
	end
		
