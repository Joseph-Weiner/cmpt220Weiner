package javaCatch;

import java.awt.TextArea;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;

public class CustomStream extends OutputStream {
	private TextArea textArea;

	public CustomStream(TextArea textArea) {
		this.textArea = textArea;
	}

	@Override
	public void write(int b) throws IOException {
		// redirects data to the text area
        textArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getParent().getWidth());
	}
}