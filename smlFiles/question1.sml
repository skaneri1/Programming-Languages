(*
 Define a function f2c in SML to convert a given Fahrenheit temperature into its Celsius equivalent. The formula is C = (F-32)*5/9. What is the expected type of this function?
 *)


fun convert(x) = 
	let
	val dv = 5.0 / 9.0;
	fun comp (x) = (x - 32.0) * dv;

	in
	comp(x)
	end
