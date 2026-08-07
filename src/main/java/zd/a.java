package zd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import yd.BacsDirectDebitOutputData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u001f¨\u0006!"}, d2 = {"Lzd/a;", "Landroid/widget/LinearLayout;", "Lkf/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "Ljn0/h0;", "c", "(Landroid/content/Context;)V", "Lje/b;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "b", "(Lje/b;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "a", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lvd/a;", "Lvd/a;", "binding", "Landroid/content/Context;", "Lxd/b;", "Lxd/b;", "bacsDelegate", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends LinearLayout implements kf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vd.a binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Context localizedContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private xd.b bacsDelegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final void c(Context localizedContext) {
        TextInputLayout textInputLayoutHolderName = this.binding.f119016g;
        s.j(textInputLayoutHolderName, "textInputLayoutHolderName");
        nf.j.g(textInputLayoutHolderName, ud.i.f116148b, localizedContext);
        TextInputLayout textInputLayoutBankAccountNumber = this.binding.f119015f;
        s.j(textInputLayoutBankAccountNumber, "textInputLayoutBankAccountNumber");
        nf.j.g(textInputLayoutBankAccountNumber, ud.i.f116147a, localizedContext);
        TextInputLayout textInputLayoutSortCode = this.binding.f119018i;
        s.j(textInputLayoutSortCode, "textInputLayoutSortCode");
        nf.j.g(textInputLayoutSortCode, ud.i.f116150d, localizedContext);
        TextInputLayout textInputLayoutShopperEmail = this.binding.f119017h;
        s.j(textInputLayoutShopperEmail, "textInputLayoutShopperEmail");
        nf.j.g(textInputLayoutShopperEmail, ud.i.f116149c, localizedContext);
    }

    @Override // kf.e
    public void b(je.b delegate, CoroutineScope coroutineScope, Context localizedContext) {
        s.k(delegate, "delegate");
        s.k(coroutineScope, "coroutineScope");
        s.k(localizedContext, "localizedContext");
        if (!(delegate instanceof xd.b)) {
            throw new IllegalArgumentException("Unsupported delegate type");
        }
        this.bacsDelegate = (xd.b) delegate;
        this.localizedContext = localizedContext;
        c(localizedContext);
        xd.b bVar = this.bacsDelegate;
        if (bVar == null) {
            s.B("bacsDelegate");
            bVar = null;
        }
        BacsDirectDebitOutputData bacsDirectDebitOutputDataC = bVar.c();
        this.binding.f119012c.setText(bacsDirectDebitOutputDataC.b().b());
        this.binding.f119011b.setText(bacsDirectDebitOutputDataC.a().b());
        this.binding.f119014e.setText(bacsDirectDebitOutputDataC.e().b());
        this.binding.f119013d.setText(bacsDirectDebitOutputDataC.d().b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        vd.a aVarB = vd.a.b(LayoutInflater.from(context), this);
        s.j(aVarB, "inflate(...)");
        this.binding = aVarB;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(gf.d.f68798b);
        setPadding(dimension, dimension, dimension, 0);
    }

    @Override // kf.e
    public void a() {
    }

    @Override // kf.e
    public View getView() {
        return this;
    }
}
