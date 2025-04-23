🔵 FileWriter – The Raw Writer (file access)
🔧 Common Constructors:
new FileWriter("file.txt")	Creates or overwrites file
new FileWriter("file.txt", true)	Creates or appends to file
🛠️ Important Methods:

Method	Description
write(String s)	Writes string to file
write(char[] cbuf)	Writes char array
write(int c)	Writes a single character
flush()	Forces data to be written to disk
close()	Closes the writer

📝 Note: No println() or formatting. Also not buffered → slower.

🟠 BufferedWriter – The Performance Booster (buffered writing)
Wrap this around a FileWriter to write fast and in chunks.

🛠️ Important Methods:

Method	Description
write(String s)	:Writes string
newLine()	:Inserts a platform-specific newline (\n)
flush()	:Flushes buffer
close()	:Closes the writer
✅ Buffered, so it's faster than FileWriter alone.
❌ No print() or printf() formatting features.

🔁 Example:
java
Copy
Edit
BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt", true));
bw.write("Hello");
bw.newLine();
bw.close();
🟣 PrintWriter – The Smart Writer (easy output)
This is the most flexible — supports formatting, auto flushing, and println().

🛠️ Important Constructors:

Constructor	Description
new PrintWriter("file.txt")	Overwrites
new PrintWriter(new FileWriter(...))	Can append
new PrintWriter(new BufferedWriter(...))	Buffered version
🔥 Powerful Methods:

Method	Description
print(String s)	Writes text (no newline)
println(String s)	Writes text + newline
printf(String format, ...)	Formatted output like C
write(String s)	Same as in FileWriter
flush()	Forces writing
close()	Closes stream
💎 Supports formatting, logging, and user-friendly writing.
❌ No built-in buffering unless you wrap with BufferedWriter.

🧙‍♂️ Summary Table: 

Feature / Method    	FileWriter	BufferedWriter	PrintWriter
write(String)	        ✅ Yes	    ✅ Yes	        ✅ Yes
print() / println()	  ❌ No	      ❌ No	          ✅ Yes
printf()	            ❌ No	      ❌ No	          ✅ Yes
newLine()	            ❌ No	      ✅ Yes	        ❌ (use println())
flush()	              ✅ Yes	    ✅ Yes	        ✅ Yes
close()	              ✅ Yes	    ✅ Yes	        ✅ Yes   
Buffering	            ❌ No	      ✅ Yes	        ❌ (unless wrapped)
Formatting support	  ❌ No	      ❌ No	          ✅ Yes
Performance	          🚫 Slow	   ⚡ Fast	        ⚡ (if buffered)
