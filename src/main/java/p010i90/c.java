package p010i90;

import f90.g;
import f90.h;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li90/j1;", "field", "", "countryCode", "Li90/i;", "addressType", "Li90/i0;", "isPlacesAvailable", "Ljn0/h0;", "b", "(Li90/j1;Ljava/lang/String;Li90/i;Li90/i0;)V", "Li90/q1;", "textConfig", "a", "(Li90/q1;Ljava/lang/String;Li90/i;Li90/i0;)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f76441c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(0);
            this.f76441c = iVar;
        }

        public final void b() {
            ((g90.c) this.f76441c).d().invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void a(q1 q1Var, String str, i iVar, i0 i0Var) {
        g90.c cVar = iVar instanceof g90.c ? (g90.c) iVar : null;
        q1Var.f().setValue(s.f(cVar != null ? Boolean.valueOf(cVar.b(str, i0Var)) : null, Boolean.TRUE) ? new w1.Trailing(g.f64611b, Integer.valueOf(h.f64633u), true, new a(iVar)) : null);
    }

    public static final void b(j1 field, String str, i addressType, i0 isPlacesAvailable) {
        s.k(field, "field");
        s.k(addressType, "addressType");
        s.k(isPlacesAvailable, "isPlacesAvailable");
        if (s.f(field.getIdentifier(), IdentifierSpec.INSTANCE.p())) {
            SimpleTextElement simpleTextElement = field instanceof SimpleTextElement ? (SimpleTextElement) field : null;
            v1 v1VarI = simpleTextElement != null ? simpleTextElement.i() : null;
            r1 r1Var = v1VarI instanceof r1 ? (r1) v1VarI : null;
            u1 textFieldConfig = r1Var != null ? r1Var.getTextFieldConfig() : null;
            q1 q1Var = textFieldConfig instanceof q1 ? (q1) textFieldConfig : null;
            if (q1Var != null) {
                a(q1Var, str, addressType, isPlacesAvailable);
            }
        }
    }
}
