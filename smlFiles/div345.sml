(* checks if n is divisible by 3 and 4 and 5. *)
fun div345(n) =
    n mod 3 = 0 andalso n mod 4 = 0 andalso n mod 5 = 0
