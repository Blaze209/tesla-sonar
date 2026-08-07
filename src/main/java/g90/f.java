package g90;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.annotation.Annotation;
import jn0.m;
import o4.x;
import p010i90.IdentifierSpec;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import ro0.o;
import ro0.p;
import vo0.a0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AddressLine1' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\fj\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lg90/f;", "", "", "serializedValue", "Li90/g0;", "identifierSpec", "", "defaultLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Li90/g0;I)V", "Lo4/x;", "capitalization-IUNYP9k", "()I", "capitalization", "Ljava/lang/String;", "getSerializedValue", "()Ljava/lang/String;", "Li90/g0;", "getIdentifierSpec", "()Li90/g0;", "I", "getDefaultLabel", "Companion", "b", "AddressLine1", "AddressLine2", "Locality", "DependentLocality", "PostalCode", "SortingCode", "AdministrativeArea", "Name", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate;

    @o("addressLine1")
    public static final f AddressLine1;

    @o("addressLine2")
    public static final f AddressLine2;

    @o("administrativeArea")
    public static final f AdministrativeArea;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @o("dependentLocality")
    public static final f DependentLocality;

    @o(PlaceTypes.LOCALITY)
    public static final f Locality;

    @o("name")
    public static final f Name;

    @o("postalCode")
    public static final f PostalCode;

    @o("sortingCode")
    public static final f SortingCode;
    private final int defaultLabel;
    private final IdentifierSpec identifierSpec;
    private final String serializedValue;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements wn0.a<ro0.d<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f67667c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ro0.d<Object> invoke() {
            return a0.a("com.stripe.android.uicore.address.FieldType", f.values(), new String[]{"addressLine1", "addressLine2", PlaceTypes.LOCALITY, "dependentLocality", "postalCode", "sortingCode", "administrativeArea", "name"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* JADX INFO: renamed from: g90.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg90/f$b;", "", "<init>", "()V", "Lro0/d;", "Lg90/f;", "serializer", "()Lro0/d;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ ro0.d a() {
            return (ro0.d) f.$cachedSerializer$delegate.getValue();
        }

        public final ro0.d<f> serializer() {
            return a();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ f[] $values() {
        return new f[]{AddressLine1, AddressLine2, Locality, DependentLocality, PostalCode, SortingCode, AdministrativeArea, Name};
    }

    static {
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        AddressLine1 = new f("AddressLine1", 0, "addressLine1", companion.p(), o30.e.f96363a);
        AddressLine2 = new f("AddressLine2", 1, "addressLine2", companion.q(), f90.h.f64614b);
        Locality = new f("Locality", 2, PlaceTypes.LOCALITY, companion.k(), o30.e.f96364b);
        DependentLocality = new f("DependentLocality", 3, "dependentLocality", companion.m(), o30.e.f96364b);
        PostalCode = new f("PostalCode", 4) { // from class: g90.f.c
            {
                IdentifierSpec identifierSpecU = IdentifierSpec.INSTANCE.u();
                int i11 = o30.e.f96369g;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "postalCode";
            }

            @Override // g90.f
            /* JADX INFO: renamed from: capitalization-IUNYP9k */
            public int mo385capitalizationIUNYP9k() {
                return x.INSTANCE.b();
            }
        };
        SortingCode = new f("SortingCode", 5) { // from class: g90.f.d
            {
                IdentifierSpec identifierSpecY = IdentifierSpec.INSTANCE.y();
                int i11 = o30.e.f96369g;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "sortingCode";
            }

            @Override // g90.f
            /* JADX INFO: renamed from: capitalization-IUNYP9k */
            public int mo385capitalizationIUNYP9k() {
                return x.INSTANCE.b();
            }
        };
        AdministrativeArea = new f("AdministrativeArea", 6, "administrativeArea", companion.z(), g.State.getStringResId());
        Name = new f("Name", 7, "name", companion.r(), o30.e.f96367e);
        f[] fVarArr$values = $values();
        $VALUES = fVarArr$values;
        $ENTRIES = on0.a.a(fVarArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = m.a(jn0.p.PUBLICATION, a.f67667c);
    }

    public /* synthetic */ f(String str, int i11, String str2, IdentifierSpec identifierSpec, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, str2, identifierSpec, i12);
    }

    public static EnumEntries<f> getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: capitalization-IUNYP9k, reason: not valid java name */
    public int mo385capitalizationIUNYP9k() {
        return x.INSTANCE.e();
    }

    public final int getDefaultLabel() {
        return this.defaultLabel;
    }

    public final IdentifierSpec getIdentifierSpec() {
        return this.identifierSpec;
    }

    public final String getSerializedValue() {
        return this.serializedValue;
    }

    private f(String str, int i11, String str2, IdentifierSpec identifierSpec, int i12) {
        super(str, i11);
        this.serializedValue = str2;
        this.identifierSpec = identifierSpec;
        this.defaultLabel = i12;
    }
}
