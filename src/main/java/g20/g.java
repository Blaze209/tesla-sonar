package g20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lg20/g;", "", "Lo20/f;", "event", "previousState", "Lg20/i;", "stateMachine", "<init>", "(Lo20/f;Lg20/g;Lg20/i;)V", "Lg20/f;", "a", "()Lg20/f;", "Lo20/f;", "b", "Lg20/g;", "c", "Lg20/i;", DateTokenConverter.CONVERTER_KEY, "Lg20/f;", "computedState", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private o20.f event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g previousState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f computedState;

    public g(o20.f event, g gVar, i stateMachine) {
        s.k(event, "event");
        s.k(stateMachine, "stateMachine");
        this.event = event;
        this.previousState = gVar;
        this.stateMachine = stateMachine;
    }

    public final synchronized f a() {
        f fVarF;
        try {
            if (this.computedState == null && this.stateMachine != null) {
                g gVar = this.previousState;
                f fVarA = gVar != null ? gVar.a() : null;
                o20.f fVar = this.event;
                if (fVar != null) {
                    i iVar = this.stateMachine;
                    s.h(iVar);
                    fVarF = iVar.f(fVar, fVarA);
                } else {
                    fVarF = null;
                }
                this.computedState = fVarF;
                this.event = null;
                this.previousState = null;
                this.stateMachine = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.computedState;
    }
}
