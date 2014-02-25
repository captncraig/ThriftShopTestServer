/** This is a thrift service to test my ThriftShop extension */

namespace java foobar

/** This service is designed to excercise all feature of various calls. */
service AwesomeService{
	
	/** Noop. Just to make sure we can call something */
	void Ping(),
	
	/** Reverses a string */
	string ReverseString(1: string s),

	/** Adds two numbers */
	i32 Add(1: i32 a, 2: i32 b),
	
	/** Accepts all primitives. Returns a string of some kind */
	string AllPrimitives(1: bool b, 2: byte by, 3: i16 sh, 4: i32 i, 5: i64 lon, 6: double dub, 7: string s),
	
}