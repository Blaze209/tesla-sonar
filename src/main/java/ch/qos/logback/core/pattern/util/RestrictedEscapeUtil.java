package ch.qos.logback.core.pattern.util;

/* JADX INFO: loaded from: classes3.dex */
public class RestrictedEscapeUtil implements IEscapeUtil {
    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c11, int i11) {
        if (str.indexOf(c11) >= 0) {
            stringBuffer.append(c11);
        } else {
            stringBuffer.append("\\");
            stringBuffer.append(c11);
        }
    }
}
