import java.util.StringTokenizer
import java.lang.StringBuilder

fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuilder()
    
    val n = br.readLine()?.toInt() ?: 0
    
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        
        sb.append(a + b).append("\n")
    }
    print(sb)
}
