package ezvcard.parameter;

import ezvcard.VCardVersion;

/* JADX INFO: loaded from: classes8.dex */
public class AddressType extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<AddressType> f63512b = new d<>(AddressType.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AddressType f63513c = new AddressType("home");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AddressType f63514d = new AddressType("work");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final AddressType f63515e = new AddressType("dom");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final AddressType f63516f = new AddressType("intl");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final AddressType f63517g = new AddressType("postal");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final AddressType f63518h = new AddressType("parcel");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final AddressType f63519i = new AddressType("pref");

    private AddressType(String str) {
        super(str);
    }

    public static AddressType d(String str) {
        return f63512b.e(str);
    }
}
