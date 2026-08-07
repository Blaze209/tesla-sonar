package z20;

import ch.qos.logback.core.joran.action.Action;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import y20.q;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\u00020\u0007\"\u001a\b\u0000\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0004\b\u0003\u0010\u0004*\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly20/q;", "W", "I", Gender.OTHER, "R", "", Action.KEY_ATTRIBUTE, "Lz20/k;", "a", "(Ly20/q;Ljava/lang/String;)Lz20/k;", "wf1-workflow-runtime"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class l {
    public static final <W extends q<? super I, ? extends O, ? extends R>, I, O, R> WorkflowNodeId a(W w11, String key) {
        s.k(w11, "<this>");
        s.k(key, "key");
        return new WorkflowNodeId(w11, key);
    }

    public static /* synthetic */ WorkflowNodeId b(q qVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return a(qVar, str);
    }
}
