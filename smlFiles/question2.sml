(*
 	The following series can be used to approximate the value of pi. Define a recursive SML function piR that computes the approximate value of pi using the first n terms of the series. What is the expected type of this function?
 *)

fun piR(n) = 
	if n = 1 then 1
	else
		if n mod 2 = 0 then piR(n-1) - (4 * (1 div ((2 * n)-1)))
		else
			piR(n-1) + (4 * (1 div ((2 * n)-1)))

			
