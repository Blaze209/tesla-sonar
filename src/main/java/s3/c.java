package s3;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.p1;
import p020r2.s3;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR1\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000e\"\u0004\b\f\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Ls3/c;", "Ls3/b;", "Ls3/a;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Lwn0/l;", "<set-?>", "b", "Lr2/p1;", "()I", "(I)V", "inputMode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<a, Boolean> onRequestInputModeChange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 inputMode;

    public /* synthetic */ c(int i11, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s3.b
    public int a() {
        return ((a) this.inputMode.getValue()).getValue();
    }

    public void b(int i11) {
        this.inputMode.setValue(a.c(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(int i11, l<? super a, Boolean> lVar) {
        this.onRequestInputModeChange = lVar;
        this.inputMode = s3.d(a.c(i11), null, 2, null);
    }
}
