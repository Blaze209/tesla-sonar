package ie0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.modules.appstate.AppStateModule;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lie0/f;", "", "", "b", "()Z", "isBackgrounded", "", "c", "()Ljava/lang/String;", "stateDescription", "Lio/reactivex/rxjava3/core/o;", "h", "()Lio/reactivex/rxjava3/core/o;", "backgroundedEvents", "E1", "a", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: E1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f77580a;

    /* JADX INFO: renamed from: ie0.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lie0/f$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lie0/f;", "a", "(Landroid/content/Context;)Lie0/f;", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f77580a = new Companion();

        private Companion() {
        }

        public final f a(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            Object applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.i(applicationContext, "null cannot be cast to non-null type com.tesla.utils.AppState");
            return (f) applicationContext;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public static String a(f fVar) {
            return fVar.b() ? AppStateModule.APP_STATE_BACKGROUND : "active";
        }
    }

    boolean b();

    String c();

    io.reactivex.rxjava3.core.o<Boolean> h();
}
