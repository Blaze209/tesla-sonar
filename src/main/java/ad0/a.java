package ad0;

import android.os.Process;
import bo0.j;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Date;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.MatchGroup;
import p013kotlin.text.m;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0016"}, d2 = {"Lad0/a;", "Lch/qos/logback/core/LayoutBase;", "Lch/qos/logback/classic/spi/ILoggingEvent;", "", "processName", "<init>", "(Ljava/lang/String;)V", "event", "c", "(Lch/qos/logback/classic/spi/ILoggingEvent;)Ljava/lang/String;", "doLayout", "a", "Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "b", "Ljava/lang/StringBuilder;", "stringBuilder", "", "I", "PROCESS_ID", DateTokenConverter.CONVERTER_KEY, "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends LayoutBase<ILoggingEvent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String processName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StringBuilder stringBuilder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int PROCESS_ID;

    public a(String processName) {
        s.k(processName, "processName");
        this.processName = processName;
        this.stringBuilder = new StringBuilder();
        this.PROCESS_ID = Process.myPid();
    }

    private final String c(ILoggingEvent event) {
        String threadName = event.getThreadName();
        s.j(threadName, "getThreadName(...)");
        return t.V(t.V(threadName, "RxCachedThreadScheduler", "RxCached", false, 4, null), "RxComputationThreadPool", "RxComp", false, 4, null);
    }

    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent event) {
        Pair pairA;
        String strW0;
        j range;
        String value;
        String string;
        s.k(event, "event");
        String message = event.getMessage();
        try {
            q qVar = new q("\\[JS\\]\\s*(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}[+-]\\d{2}:\\d{2}: )");
            s.h(message);
            String string2 = null;
            m mVarD = q.d(qVar, message, 0, 2, null);
            if (mVarD != null) {
                MatchGroup matchGroup = mVarD.b().get(1);
                if (matchGroup == null || (value = matchGroup.getValue()) == null || (string = t.F1(value).toString()) == null || (strW0 = t.W0(string, ":")) == null) {
                    strW0 = "";
                }
                MatchGroup matchGroup2 = mVarD.b().get(1);
                if (matchGroup2 != null && (range = matchGroup2.getRange()) != null) {
                    string2 = t.F1(t.V(t.V0(message, range).toString(), "\n", "", false, 4, null)).toString();
                }
                pairA = x.a(strW0, string2);
            } else {
                pairA = x.a(com.tesla.logging.c.f56371a.a(new Date(event.getTimeStamp())), t.F1(t.V(message, "\n", "", false, 4, null)).toString());
            }
            String str = (String) pairA.a();
            String str2 = (String) pairA.b();
            StringBuilder sb2 = this.stringBuilder;
            sb2.append(str);
            sb2.append(" ");
            String string3 = event.getLevel().toString();
            s.j(string3, "toString(...)");
            String strSubstring = string3.substring(0, 1);
            s.j(strSubstring, "substring(...)");
            sb2.append(d.c(strSubstring, 1, null, null, false, 14, null));
            sb2.append(d.c(this.processName + ":" + this.PROCESS_ID + ":" + c(event), 30, null, null, false, 14, null));
            sb2.append(" ");
            sb2.append(str2);
            sb2.append('\n');
            s.j(sb2, "append(...)");
            String string4 = sb2.toString();
            s.j(string4, "toString(...)");
            t.q(this.stringBuilder);
            return string4;
        } catch (Exception e11) {
            return "ERROR THROWN ON LAYOUT FOR FILE LOGGING: " + e11.getMessage() + " `original message: " + message + "`";
        }
    }
}
