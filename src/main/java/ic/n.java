package ic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ec.g0;
import ec.h0;
import ec.r;
import ec.u;
import gc.w;
import okio.c0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lic/n;", "Lic/j;", "Lec/g0;", "data", "Lrc/n;", "options", "<init>", "(Lec/g0;Lrc/n;)V", "", "b", "(Lec/g0;)Ljava/lang/Void;", "Lic/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lec/g0;", "Lrc/n;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lic/n$a;", "Lic/j$a;", "Lec/g0;", "<init>", "()V", "data", "", "c", "(Lec/g0;)Z", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lic/j;", "b", "(Lec/g0;Lrc/n;Lec/r;)Lic/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<g0> {
        private final boolean c(g0 data) {
            return s.f(data.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String(), "android.resource");
        }

        @Override // ic.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(g0 data, Options options, r imageLoader) {
            if (c(data)) {
                return new n(data, options);
            }
            return null;
        }
    }

    public n(g0 g0Var, Options options) {
        this.data = g0Var;
        this.options = options;
    }

    private final Void b(g0 data) {
        throw new IllegalStateException("Invalid android.resource URI: " + data);
    }

    @Override // ic.j
    public Object a(Continuation<? super i> continuation) {
        Integer numX;
        String authority = this.data.getAuthority();
        if (authority != null) {
            if (t.y0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) v.C0(h0.f(this.data));
                if (str == null || (numX = t.x(str)) == null) {
                    b(this.data);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = numX.intValue();
                Context context = this.options.getContext();
                Resources resources = s.f(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strB = yc.v.f125365a.b(typedValue.string.toString());
                if (!s.f(strB, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new SourceFetchResult(gc.v.a(c0.d(c0.m(resources.openRawResource(iIntValue, typedValue2))), this.options.getFileSystem(), new w(authority, iIntValue, typedValue2.density)), strB, gc.h.DISK);
                }
                Drawable drawableC = s.f(authority, context.getPackageName()) ? yc.e.c(context, iIntValue) : yc.e.f(context, resources, iIntValue);
                boolean zJ = yc.g0.j(drawableC);
                if (zJ) {
                    drawableC = new BitmapDrawable(context.getResources(), yc.h.f125348a.a(drawableC, rc.i.h(this.options), this.options.getSize(), this.options.getScale(), this.options.getPrecision() == sc.c.INEXACT));
                }
                return new ImageFetchResult(u.c(drawableC), zJ, gc.h.DISK);
            }
        }
        b(this.data);
        throw new KotlinNothingValueException();
    }
}
