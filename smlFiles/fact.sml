(* The following series can be used to approximate the value of pi. Define a recursive SML function piR that computes the approximate value of pi using the first n terms of the series. What is the expected type of this function? *)

fun piR(n) =
    let fun iter(count, prod) =
	if count > n then prod
	else
	    let
		val newCount = count + 1;
		val newProd = count * prod
	    in
		iter(newCount, newProd)
	    end
    in
	iter(1, 1) (* starting values for count and prod *)
    end
	
