package k20;

import androidx.core.util.Consumer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR$\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010!\"\u0004\b\"\u0010#R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010!\"\u0004\b$\u0010#R4\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lk20/o;", "", "Lk20/a;", "Lt20/c;", "foregroundTimeout", "backgroundTimeout", "<init>", "(Lt20/c;Lt20/c;)V", "", "a", "Ljava/lang/Boolean;", "_isPaused", "b", "Lk20/o;", "getSourceConfig$snowplow_android_tracker_release", "()Lk20/o;", "e", "(Lk20/o;)V", "sourceConfig", "c", "Lt20/c;", "_foregroundTimeout", DateTokenConverter.CONVERTER_KEY, "_backgroundTimeout", "Landroidx/core/util/Consumer;", "Ls20/f;", "Landroidx/core/util/Consumer;", "_onSessionUpdate", "value", "()Z", "setPaused$snowplow_android_tracker_release", "(Z)V", "isPaused", "()Lt20/c;", "setForegroundTimeout", "(Lt20/c;)V", "setBackgroundTimeout", "()Landroidx/core/util/Consumer;", "setOnSessionUpdate", "(Landroidx/core/util/Consumer;)V", "onSessionUpdate", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Boolean _isPaused;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private o sourceConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t20.c _foregroundTimeout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t20.c _backgroundTimeout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Consumer<s20.f> _onSessionUpdate;

    public o(t20.c cVar, t20.c cVar2) {
        if (cVar != null) {
            this._foregroundTimeout = cVar;
        }
        if (cVar2 != null) {
            this._backgroundTimeout = cVar2;
        }
    }

    public t20.c a() {
        t20.c cVar = this._backgroundTimeout;
        if (cVar != null) {
            return cVar;
        }
        o oVar = this.sourceConfig;
        t20.c cVarA = oVar != null ? oVar.a() : null;
        return cVarA == null ? new t20.c(h20.q.f70530a.b(), TimeUnit.SECONDS) : cVarA;
    }

    public t20.c b() {
        t20.c cVar = this._foregroundTimeout;
        if (cVar != null) {
            return cVar;
        }
        o oVar = this.sourceConfig;
        t20.c cVarB = oVar != null ? oVar.b() : null;
        return cVarB == null ? new t20.c(h20.q.f70530a.h(), TimeUnit.SECONDS) : cVarB;
    }

    public Consumer<s20.f> c() {
        Consumer<s20.f> consumer = this._onSessionUpdate;
        if (consumer != null) {
            return consumer;
        }
        o oVar = this.sourceConfig;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public final boolean d() {
        Boolean bool = this._isPaused;
        if (bool != null) {
            return bool.booleanValue();
        }
        o oVar = this.sourceConfig;
        Boolean boolValueOf = oVar != null ? Boolean.valueOf(oVar.d()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void e(o oVar) {
        this.sourceConfig = oVar;
    }

    public /* synthetic */ o(t20.c cVar, t20.c cVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? null : cVar2);
    }
}
