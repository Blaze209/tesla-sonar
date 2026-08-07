package f;

import androidx.p002activity.b0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRD\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0018\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lf/j;", "Landroidx/activity/b0;", "", "enabled", "Lkotlinx/coroutines/CoroutineScope;", "onBackScope", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/b;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "currentOnBack", "<init>", "(ZLkotlinx/coroutines/CoroutineScope;Lwn0/p;)V", "b", "(Z)V", "backEvent", "handleOnBackStarted", "(Landroidx/activity/b;)V", "handleOnBackProgressed", "handleOnBackPressed", "()V", "handleOnBackCancelled", "a", "Lkotlinx/coroutines/CoroutineScope;", "getOnBackScope", "()Lkotlinx/coroutines/CoroutineScope;", "c", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lwn0/p;", "getCurrentOnBack", "()Lwn0/p;", "(Lwn0/p;)V", "Lf/i;", "Lf/i;", "onBackInstance", DateTokenConverter.CONVERTER_KEY, "Z", "isActive", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class j extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope onBackScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private p<? super Flow<androidx.p002activity.b>, ? super Continuation<? super h0>, ? extends Object> currentOnBack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i onBackInstance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isActive;

    public j(boolean z11, CoroutineScope coroutineScope, p<? super Flow<androidx.p002activity.b>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        super(z11);
        this.onBackScope = coroutineScope;
        this.currentOnBack = pVar;
    }

    public final void a(p<? super Flow<androidx.p002activity.b>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        this.currentOnBack = pVar;
    }

    public final void b(boolean enabled) {
        i iVar;
        if (!enabled && !this.isActive && getIsEnabled() && (iVar = this.onBackInstance) != null) {
            iVar.a();
        }
        setEnabled(enabled);
    }

    public final void c(CoroutineScope coroutineScope) {
        this.onBackScope = coroutineScope;
    }

    @Override // androidx.p002activity.b0
    public void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        i iVar = this.onBackInstance;
        if (iVar != null) {
            iVar.a();
        }
        i iVar2 = this.onBackInstance;
        if (iVar2 != null) {
            iVar2.f(false);
        }
        this.isActive = false;
    }

    @Override // androidx.p002activity.b0
    public void handleOnBackPressed() {
        i iVar = this.onBackInstance;
        if (iVar != null && !iVar.getIsPredictiveBack()) {
            iVar.a();
            this.onBackInstance = null;
        }
        if (this.onBackInstance == null) {
            this.onBackInstance = new i(this.onBackScope, false, this.currentOnBack, this);
        }
        i iVar2 = this.onBackInstance;
        if (iVar2 != null) {
            iVar2.b();
        }
        i iVar3 = this.onBackInstance;
        if (iVar3 != null) {
            iVar3.f(false);
        }
        this.isActive = false;
    }

    @Override // androidx.p002activity.b0
    public void handleOnBackProgressed(androidx.p002activity.b backEvent) {
        super.handleOnBackProgressed(backEvent);
        i iVar = this.onBackInstance;
        if (iVar != null) {
            ChannelResult.m530boximpl(iVar.e(backEvent));
        }
    }

    @Override // androidx.p002activity.b0
    public void handleOnBackStarted(androidx.p002activity.b backEvent) {
        super.handleOnBackStarted(backEvent);
        i iVar = this.onBackInstance;
        if (iVar != null) {
            iVar.a();
        }
        if (getIsEnabled()) {
            this.onBackInstance = new i(this.onBackScope, true, this.currentOnBack, this);
        }
        this.isActive = true;
    }
}
