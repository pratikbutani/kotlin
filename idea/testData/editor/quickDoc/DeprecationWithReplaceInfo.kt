@Deprecated("lol no more mainstream", replaceWith = ReplaceWith(expression = "kek()"))
fun <caret>lol() {
    println("lol")
}

//INFO: @<a href="psi_element://kotlin.Deprecated">Deprecated</a> <b>public</b> <b>fun</b> lol(): Unit <i>defined in</i> root package<DL><DT><b>Deprecated:</b></DT><DD>lol no more mainstream</DD><DT><b>Replace with:</b></DT><DD><code>kek()</code></DD></DL>
