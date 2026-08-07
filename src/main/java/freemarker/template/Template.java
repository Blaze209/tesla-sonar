package freemarker.template;

import freemarker.core.Configurable;
import freemarker.core.ParseException;

/* JADX INFO: loaded from: classes8.dex */
public class Template extends Configurable {

    public static class WrongEncodingException extends ParseException {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f66510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f66511k;

        @Override // freemarker.core.ParseException, java.lang.Throwable
        public String getMessage() {
            String string;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Encoding specified inside the template (");
            stringBuffer.append(this.f66510j);
            stringBuffer.append(") doesn't match the encoding specified for the Template constructor");
            if (this.f66511k != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(" (");
                stringBuffer2.append(this.f66511k);
                stringBuffer2.append(").");
                string = stringBuffer2.toString();
            } else {
                string = ".";
            }
            stringBuffer.append(string);
            return stringBuffer.toString();
        }
    }
}
