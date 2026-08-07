package t60;

import java.util.ArrayList;
import java.util.List;
import p010i90.IdentifierSpec;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import u60.k;
import z80.AddressSpec;
import z80.AffirmTextSpec;
import z80.AfterpayClearpayTextSpec;
import z80.AuBankAccountNumberSpec;
import z80.AuBecsDebitMandateTextSpec;
import z80.BsbSpec;
import z80.CashAppPayMandateTextSpec;
import z80.CountrySpec;
import z80.DropdownSpec;
import z80.EmailSpec;
import z80.EmptyFormElement;
import z80.IbanSpec;
import z80.KlarnaHeaderStaticTextSpec;
import z80.KlarnaMandateTextSpec;
import z80.MandateTextSpec;
import z80.NameSpec;
import z80.PhoneSpec;
import z80.PlaceholderSpec;
import z80.SepaMandateTextSpec;
import z80.SimpleTextSpec;
import z80.StaticTextSpec;
import z80.e1;
import z80.n;
import z80.o;
import z80.w1;
import z80.z0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt60/h;", "", "Lu60/k$a;", "arguments", "<init>", "(Lu60/k$a;)V", "", "Lz80/e1;", "specs", "Li90/g0;", "placeholderOverrideList", "Li90/d0;", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lu60/k$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.a arguments;

    public h(k.a arguments) {
        s.k(arguments, "arguments");
        this.arguments = arguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List b(h hVar, List list, List list2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = v.m();
        }
        return hVar.a(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<d0> a(List<? extends e1> specs, List<IdentifierSpec> placeholderOverrideList) {
        d0 d0VarE;
        s.k(specs, "specs");
        s.k(placeholderOverrideList, "placeholderOverrideList");
        List<e1> listF = u70.f.f115846a.f(specs, placeholderOverrideList, this.arguments.getRequiresMandate(), this.arguments.getBillingDetailsCollectionConfiguration());
        ArrayList arrayList = new ArrayList();
        for (e1 e1Var : listF) {
            if (e1Var instanceof StaticTextSpec) {
                d0VarE = ((StaticTextSpec) e1Var).e();
            } else if (e1Var instanceof AfterpayClearpayTextSpec) {
                d0VarE = ((AfterpayClearpayTextSpec) e1Var).e();
            } else if (e1Var instanceof AffirmTextSpec) {
                d0VarE = ((AffirmTextSpec) e1Var).e();
            } else {
                IdentifierSpec identifierSpec = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (e1Var instanceof z0) {
                    d0VarE = new EmptyFormElement(identifierSpec, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
                } else if (e1Var instanceof MandateTextSpec) {
                    d0VarE = ((MandateTextSpec) e1Var).e(this.arguments.getMerchantName());
                } else if (e1Var instanceof AuBecsDebitMandateTextSpec) {
                    d0VarE = ((AuBecsDebitMandateTextSpec) e1Var).e(this.arguments.getMerchantName());
                } else if (e1Var instanceof n) {
                    d0VarE = ((n) e1Var).e(this.arguments.d());
                } else if (e1Var instanceof o) {
                    d0VarE = ((o) e1Var).e(this.arguments.getMerchantName(), this.arguments.d());
                } else if (e1Var instanceof BsbSpec) {
                    d0VarE = ((BsbSpec) e1Var).e(this.arguments.d());
                } else if (e1Var instanceof w1) {
                    d0VarE = ((w1) e1Var).f();
                } else if (e1Var instanceof NameSpec) {
                    d0VarE = ((NameSpec) e1Var).f(this.arguments.d());
                } else if (e1Var instanceof EmailSpec) {
                    d0VarE = ((EmailSpec) e1Var).e(this.arguments.d());
                } else if (e1Var instanceof PhoneSpec) {
                    d0VarE = ((PhoneSpec) e1Var).e(this.arguments.d());
                } else if (e1Var instanceof SimpleTextSpec) {
                    d0VarE = ((SimpleTextSpec) e1Var).f(this.arguments.d());
                } else if (e1Var instanceof AuBankAccountNumberSpec) {
                    d0VarE = ((AuBankAccountNumberSpec) e1Var).e(this.arguments.d());
                } else if (e1Var instanceof IbanSpec) {
                    d0VarE = ((IbanSpec) e1Var).e(this.arguments.d());
                } else if (e1Var instanceof KlarnaHeaderStaticTextSpec) {
                    d0VarE = ((KlarnaHeaderStaticTextSpec) e1Var).e();
                } else if (e1Var instanceof DropdownSpec) {
                    d0VarE = ((DropdownSpec) e1Var).f(this.arguments.d());
                } else if (e1Var instanceof CountrySpec) {
                    d0VarE = ((CountrySpec) e1Var).f(this.arguments.d());
                } else if (e1Var instanceof AddressSpec) {
                    d0VarE = ((AddressSpec) e1Var).h(this.arguments.d(), this.arguments.j());
                } else if (e1Var instanceof SepaMandateTextSpec) {
                    d0VarE = ((SepaMandateTextSpec) e1Var).e(this.arguments.getMerchantName());
                } else if (e1Var instanceof PlaceholderSpec) {
                    d0VarE = null;
                } else if (e1Var instanceof CashAppPayMandateTextSpec) {
                    d0VarE = ((CashAppPayMandateTextSpec) e1Var).e(this.arguments.getMerchantName());
                } else {
                    if (!(e1Var instanceof KlarnaMandateTextSpec)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d0VarE = ((KlarnaMandateTextSpec) e1Var).e(this.arguments.getMerchantName());
                }
            }
            if (d0VarE != null) {
                arrayList.add(d0VarE);
            }
        }
        return arrayList;
    }
}
