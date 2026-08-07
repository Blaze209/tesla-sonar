package androidx.compose.foundation.selection;

import b4.t1;
import g4.i;
import g4.v;
import g4.y;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import q1.e0;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJR\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/selection/d;", "Landroidx/compose/foundation/e;", "", "value", "Lu1/l;", "interactionSource", "Lq1/e0;", "indicationNodeFactory", "enabled", "Lg4/i;", "role", "Lkotlin/Function1;", "Ljn0/h0;", "onValueChange", "<init>", "(ZLu1/l;Lq1/e0;ZLg4/i;Lwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a3", "(ZLu1/l;Lq1/e0;ZLg4/i;Lwn0/l;)V", "Lg4/y;", "J2", "(Lg4/y;)V", "J", "Z", "K", "Lwn0/l;", "Lkotlin/Function0;", "L", "Lwn0/a;", "get_onClick", "()Lwn0/a;", "_onClick", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d extends androidx.compose.foundation.e {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean value;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private l<? super Boolean, h0> onValueChange;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final wn0.a<h0> _onClick;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Boolean, h0> f4941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4942d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Boolean, h0> lVar, boolean z11) {
            super(0);
            this.f4941c = lVar;
            this.f4942d = z11;
        }

        public final void b() {
            this.f4941c.invoke(Boolean.valueOf(!this.f4942d));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<h0> {
        b() {
            super(0);
        }

        public final void b() {
            d.this.onValueChange.invoke(Boolean.valueOf(!d.this.value));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public /* synthetic */ d(boolean z11, u1.l lVar, e0 e0Var, boolean z12, i iVar, l lVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, lVar, e0Var, z12, iVar, lVar2);
    }

    @Override // androidx.compose.foundation.a
    public void J2(y yVar) {
        v.y0(yVar, h4.b.a(this.value));
    }

    public final void a3(boolean value, u1.l interactionSource, e0 indicationNodeFactory, boolean enabled, i role, l<? super Boolean, h0> onValueChange) {
        if (this.value != value) {
            this.value = value;
            t1.b(this);
        }
        this.onValueChange = onValueChange;
        super.X2(interactionSource, indicationNodeFactory, enabled, null, role, this._onClick);
    }

    private d(boolean z11, u1.l lVar, e0 e0Var, boolean z12, i iVar, l<? super Boolean, h0> lVar2) {
        super(lVar, e0Var, z12, null, iVar, new a(lVar2, z11), null);
        this.value = z11;
        this.onValueChange = lVar2;
        this._onClick = new b();
    }
}
