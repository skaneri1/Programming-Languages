(*
 computes the max of three ints. There is a buil-in function Int.max
 to compute max of two numbers which can be used for this purpose
 *)
fun max3(a,b,c) =
    if a > b then
	if a > c then a
	else c
    else
	if b > c then b
	else c
