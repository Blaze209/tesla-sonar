package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AggregateException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Throwable> f17878a;

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i11 = -1;
        for (Throwable th2 : this.f17878a) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i11++;
            printStream.append((CharSequence) Integer.toString(i11));
            printStream.append(": ");
            th2.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i11 = -1;
        for (Throwable th2 : this.f17878a) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i11++;
            printWriter.append((CharSequence) Integer.toString(i11));
            printWriter.append(": ");
            th2.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}
