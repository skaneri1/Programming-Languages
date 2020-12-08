(*
 Write a recursive (or tail recursive) SML function genTriangle: int -> string that returns a string which, when printed using the built-in print: string -> unit function, produces a triangular pattern.
 *)

fun genTriangle(x) =  
    if (x = 0) then "\n"  
    else   
        let  
            fun makeTriangle(n) =  
                if(n = 0) then "\n"
                else ("*" ^ makeTriangle(n-1))
        in
            makeTriangle(x)
        end