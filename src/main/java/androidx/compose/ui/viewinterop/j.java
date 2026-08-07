package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.j3;
import b4.j1;
import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p020r2.q;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u0010,\"\u0004\b-\u0010.RB\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105RB\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105RB\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\u0014\u0010@\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/compose/ui/viewinterop/j;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/d;", "Landroidx/compose/ui/platform/j3;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr2/q;", "parentContext", "typedView", "Lu3/b;", "dispatcher", "La3/g;", "saveStateRegistry", "", "compositeKeyHash", "Lb4/j1;", "owner", "<init>", "(Landroid/content/Context;Lr2/q;Landroid/view/View;Lu3/b;La3/g;ILb4/j1;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;Lwn0/l;Lr2/q;La3/g;ILb4/j1;)V", "Ljn0/h0;", "s", "()V", "t", "A", "Landroid/view/View;", "B", "Lu3/b;", "getDispatcher", "()Lu3/b;", "C", "La3/g;", "D", "I", "", "E", "Ljava/lang/String;", "saveStateKey", "La3/g$a;", "value", Gender.FEMALE, "La3/g$a;", "setSavableRegistryEntry", "(La3/g$a;)V", "savableRegistryEntry", "G", "Lwn0/l;", "getUpdateBlock", "()Lwn0/l;", "setUpdateBlock", "(Lwn0/l;)V", "updateBlock", "H", "getResetBlock", "setResetBlock", "resetBlock", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j<T extends View> extends androidx.compose.ui.viewinterop.d implements j3 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final T typedView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final u3.b dispatcher;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final a3.g saveStateRegistry;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int compositeKeyHash;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String saveStateKey;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private a3.g.a savableRegistryEntry;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private l<? super T, h0> updateBlock;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private l<? super T, h0> resetBlock;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private l<? super T, h0> releaseBlock;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements wn0.a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f6286c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j<T> jVar) {
            super(0);
            this.f6286c = jVar;
        }

        @Override // wn0.a
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((j) this.f6286c).typedView.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f6287c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j<T> jVar) {
            super(0);
            this.f6287c = jVar;
        }

        public final void b() {
            this.f6287c.getReleaseBlock().invoke(((j) this.f6287c).typedView);
            this.f6287c.t();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f6288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j<T> jVar) {
            super(0);
            this.f6288c = jVar;
        }

        public final void b() {
            this.f6288c.getResetBlock().invoke(((j) this.f6288c).typedView);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f6289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j<T> jVar) {
            super(0);
            this.f6289c = jVar;
        }

        public final void b() {
            this.f6289c.getUpdateBlock().invoke(((j) this.f6289c).typedView);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* synthetic */ j(Context context, q qVar, View view, u3.b bVar, a3.g gVar, int i11, j1 j1Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : qVar, view, (i12 & 8) != 0 ? new u3.b() : bVar, gVar, i11, j1Var);
    }

    private final void s() {
        a3.g gVar = this.saveStateRegistry;
        if (gVar != null) {
            setSavableRegistryEntry(gVar.b(this.saveStateKey, new a(this)));
        }
    }

    private final void setSavableRegistryEntry(a3.g.a aVar) {
        a3.g.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.savableRegistryEntry = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        setSavableRegistryEntry(null);
    }

    public final u3.b getDispatcher() {
        return this.dispatcher;
    }

    public final l<T, h0> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final l<T, h0> getResetBlock() {
        return this.resetBlock;
    }

    @Override // androidx.compose.ui.platform.j3
    public /* bridge */ /* synthetic */ androidx.compose.ui.platform.a getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final l<T, h0> getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.j3
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(l<? super T, h0> lVar) {
        this.releaseBlock = lVar;
        setRelease(new b(this));
    }

    public final void setResetBlock(l<? super T, h0> lVar) {
        this.resetBlock = lVar;
        setReset(new c(this));
    }

    public final void setUpdateBlock(l<? super T, h0> lVar) {
        this.updateBlock = lVar;
        setUpdate(new d(this));
    }

    private j(Context context, q qVar, T t11, u3.b bVar, a3.g gVar, int i11, j1 j1Var) {
        super(context, qVar, i11, bVar, t11, j1Var);
        this.typedView = t11;
        this.dispatcher = bVar;
        this.saveStateRegistry = gVar;
        this.compositeKeyHash = i11;
        setClipChildren(false);
        String strValueOf = String.valueOf(i11);
        this.saveStateKey = strValueOf;
        Object objF = gVar != null ? gVar.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            t11.restoreHierarchyState(sparseArray);
        }
        s();
        this.updateBlock = f.e();
        this.resetBlock = f.e();
        this.releaseBlock = f.e();
    }

    public j(Context context, l<? super Context, ? extends T> lVar, q qVar, a3.g gVar, int i11, j1 j1Var) {
        this(context, qVar, lVar.invoke(context), null, gVar, i11, j1Var, 8, null);
    }
}
