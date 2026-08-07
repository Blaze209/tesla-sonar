package wb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import gc0.u0;
import java.util.HashMap;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0001¢\u0006\u0004\b\u000b\u0010\n\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0001¢\u0006\u0004\b\f\u0010\n\u001a\u0011\u0010\r\u001a\u00020\b*\u00020\u0001¢\u0006\u0004\b\r\u0010\n\u001a\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\n\u001a\u0011\u0010\u000f\u001a\u00020\b*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\n\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012\"6\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0010`\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lgc0/u0$d;", "Lqf0/a;", "j", "(Lgc0/u0$d;)Lqf0/a;", "", "a", "(Lqf0/a;)Ljava/lang/String;", "c", "", DateTokenConverter.CONVERTER_KEY, "(Lqf0/a;)Z", "f", "e", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "", "b", "(Ljava/lang/String;)Ljava/lang/Integer;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "getMapping", "()Ljava/util/HashMap;", "mapping", "domain_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<Character, Integer> f121653a = v0.k(x.a('1', 2001), x.a('2', 2002), x.a('3', 2003), x.a('4', 2004), x.a('5', 2005), x.a('6', 2006), x.a('7', 2007), x.a('8', 2008), x.a('9', 2009), x.a('A', 2010), x.a('B', 2011), x.a('C', 2012), x.a('D', 2013), x.a('E', 2014), x.a('F', 2015), x.a('G', 2016), x.a('H', 2017), x.a('J', 2018), x.a('K', 2019), x.a('L', 2020), x.a('M', 2021), x.a('N', 2022), x.a('P', 2023), x.a('R', 2024), x.a('S', 2025), x.a('T', 2026), x.a('V', 2027), x.a('W', 2028), x.a('X', 2029), x.a('Y', 2030));

    /* JADX INFO: renamed from: wb0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C2610a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121654a;

        static {
            int[] iArr = new int[qf0.a.values().length];
            try {
                iArr[qf0.a.CAR_TYPE_MODEL3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qf0.a.CAR_TYPE_MODELY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qf0.a.CAR_TYPE_MODELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qf0.a.CAR_TYPE_MODELS2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qf0.a.CAR_TYPE_LYCHEE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qf0.a.CAR_TYPE_MODELX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qf0.a.CAR_TYPE_TAMARIND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qf0.a.CAR_TYPE_SEMI_TRUCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[qf0.a.CAR_TYPE_CYBERTRUCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f121654a = iArr;
        }
    }

    public static final String a(qf0.a aVar) {
        s.k(aVar, "<this>");
        switch (C2610a.f121654a[aVar.ordinal()]) {
            case 1:
                return "model3";
            case 2:
                return "modely";
            case 3:
                return "models";
            case 4:
                return "models2";
            case 5:
                return "lychee";
            case 6:
                return "modelx";
            case 7:
                return "tamarind";
            case 8:
                return "semitruck";
            case 9:
                return "cybertruck";
            default:
                return "unknown";
        }
    }

    public static final Integer b(String str) {
        s.k(str, "<this>");
        if (str.length() <= 9) {
            return null;
        }
        return f121653a.get(Character.valueOf(str.charAt(9)));
    }

    public static final String c(qf0.a aVar) {
        s.k(aVar, "<this>");
        if (d(aVar)) {
            return "Cybertruck";
        }
        if (f(aVar)) {
            return "Model S";
        }
        if (e(aVar)) {
            return "Model 3";
        }
        if (g(aVar)) {
            return "Model X";
        }
        if (h(aVar)) {
            return "Model Y";
        }
        return i(aVar) ? "Semi-Truck" : "Tesla";
    }

    public static final boolean d(qf0.a aVar) {
        s.k(aVar, "<this>");
        return aVar == qf0.a.CAR_TYPE_CYBERTRUCK;
    }

    public static final boolean e(qf0.a aVar) {
        s.k(aVar, "<this>");
        return aVar == qf0.a.CAR_TYPE_MODEL3;
    }

    public static final boolean f(qf0.a aVar) {
        s.k(aVar, "<this>");
        return aVar == qf0.a.CAR_TYPE_MODELS || aVar == qf0.a.CAR_TYPE_LYCHEE || aVar == qf0.a.CAR_TYPE_MODELS2;
    }

    public static final boolean g(qf0.a aVar) {
        s.k(aVar, "<this>");
        return aVar == qf0.a.CAR_TYPE_MODELX || aVar == qf0.a.CAR_TYPE_TAMARIND;
    }

    public static final boolean h(qf0.a aVar) {
        s.k(aVar, "<this>");
        return aVar == qf0.a.CAR_TYPE_MODELY;
    }

    public static final boolean i(qf0.a aVar) {
        s.k(aVar, "<this>");
        return aVar == qf0.a.CAR_TYPE_SEMI_TRUCK;
    }

    public static final qf0.a j(u0.d dVar) {
        if (e.k0(dVar != null ? dVar.getCarTypeCybertruck() : null)) {
            return qf0.a.CAR_TYPE_CYBERTRUCK;
        }
        if (e.k0(dVar != null ? dVar.getCarTypeModelS() : null)) {
            return qf0.a.CAR_TYPE_MODELS;
        }
        if (e.k0(dVar != null ? dVar.getCarTypeLychee() : null)) {
            return qf0.a.CAR_TYPE_LYCHEE;
        }
        if (e.k0(dVar != null ? dVar.getCarTypeModelS2() : null)) {
            return qf0.a.CAR_TYPE_MODELS2;
        }
        if (e.k0(dVar != null ? dVar.getCarTypeModel3() : null)) {
            return qf0.a.CAR_TYPE_MODEL3;
        }
        if (e.k0(dVar != null ? dVar.getCarTypeModelX() : null)) {
            return qf0.a.CAR_TYPE_MODELX;
        }
        if (e.k0(dVar != null ? dVar.getCarTypeTamarind() : null)) {
            return qf0.a.CAR_TYPE_TAMARIND;
        }
        if (e.k0(dVar != null ? dVar.getCarTypeModelY() : null)) {
            return qf0.a.CAR_TYPE_MODELY;
        }
        return e.k0(dVar != null ? dVar.getCarTypeSemiTruck() : null) ? qf0.a.CAR_TYPE_SEMI_TRUCK : qf0.a.CAR_TYPE_UNKNOWN;
    }
}
