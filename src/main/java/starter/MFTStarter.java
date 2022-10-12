package starter;

import java.io.IOException;
import java.util.List;

import com.webencyclop.core.mftool.MFTool;
import com.webencyclop.core.mftool.models.output.SchemeNameCodePair;

public class MFTStarter {
	
	public static void main(String args[]) throws IOException {
		MFTool mfTool = new MFTool();
		List<SchemeNameCodePair> list = mfTool.matchingScheme("Axis");
		for (SchemeNameCodePair s:list) {
			System.out.println(s.toString());
		}
	}
}
