import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.BinaryComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class NewText extends Text {
    
    private Text word;
    
    public NewText(Text word){
        this.word = word;
    }
    
    public NewText(String word) {
        this(new Text(word));
    }
    
    public NewText() {
        this.word = new Text();
    }
    
    
    @Override
    public int compareTo(BinaryComparable other)
    {
        return -1 * super.compareTo(other);
    }
}