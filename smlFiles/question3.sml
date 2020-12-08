fun piR(n) =
    let fun iter(count) =
	if count mod 2 = 0 then count + 4*(Math.pow(-1, n-1)/((2*n)-1));
	else
	    let
		val newCount = count - 1;
	    in
		iter(newCount)
	    end
    in
	iter(3)
    end

    