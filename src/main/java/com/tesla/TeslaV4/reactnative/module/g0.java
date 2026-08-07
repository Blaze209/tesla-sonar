package com.tesla.TeslaV4.reactnative.module;

import android.util.SparseArray;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/g0;", "", "", "id", "", Action.KEY_ATTRIBUTE, "Lcom/google/android/libraries/places/api/model/Place$Field;", "field", "<init>", "(Ljava/lang/String;IILjava/lang/String;Lcom/google/android/libraries/places/api/model/Place$Field;)V", "Ljava/lang/String;", "Lcom/google/android/libraries/places/api/model/Place$Field;", "getField", "()Lcom/google/android/libraries/places/api/model/Place$Field;", "Companion", "b", "a", "ADDRESS", "ID", "LAT_LNG", "NAME", "OPENING_HOURS", "PHONE_NUMBER", "PHOTO_METADATAS", "PLUS_CODE", "PRICE_LEVEL", "RATING", "TYPES", "USER_RATINGS_TOTAL", "VIEWPORT", "WEBSITE_URI", "ADDRESS_COMPONENTS", "BUSINESS_STATUS", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum g0 {
    ADDRESS(1, PlaceTypes.ADDRESS, Place.Field.ADDRESS),
    ID(2, "placeID", Place.Field.ID),
    LAT_LNG(3, "location", Place.Field.LAT_LNG),
    NAME(4, "name", Place.Field.NAME),
    OPENING_HOURS(5, "openingHours", Place.Field.OPENING_HOURS),
    PHONE_NUMBER(6, "phoneNumber", Place.Field.PHONE_NUMBER),
    PHOTO_METADATAS(7, "photos", Place.Field.PHOTO_METADATAS),
    PLUS_CODE(8, "plusCode", Place.Field.PLUS_CODE),
    PRICE_LEVEL(9, "priceLevel", Place.Field.PRICE_LEVEL),
    RATING(10, "rating", Place.Field.RATING),
    TYPES(11, "types", Place.Field.TYPES),
    USER_RATINGS_TOTAL(12, "userRatingsTotal", Place.Field.USER_RATINGS_TOTAL),
    VIEWPORT(13, "viewport", Place.Field.VIEWPORT),
    WEBSITE_URI(14, "website", Place.Field.WEBSITE_URI),
    ADDRESS_COMPONENTS(15, "addressComponents", Place.Field.ADDRESS_COMPONENTS),
    BUSINESS_STATUS(16, "businessStatus", Place.Field.BUSINESS_STATUS);

    private final Place.Field field;
    private final String key;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.tesla.TeslaV4.reactnative.module.g0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/g0$a;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "Lcom/tesla/TeslaV4/reactnative/module/g0;", "a", "(Ljava/lang/String;)Lcom/tesla/TeslaV4/reactnative/module/g0;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
        public final g0 a(String key) {
            int i11;
            if (key != null) {
                switch (key) {
                    case "plusCode":
                        i11 = 8;
                        break;
                    case "openingHours":
                        i11 = 5;
                        break;
                    case "priceLevel":
                        i11 = 9;
                        break;
                    case "phoneNumber":
                        i11 = 6;
                        break;
                    case "address":
                        i11 = 1;
                        break;
                    case "photos":
                        i11 = 7;
                        break;
                    case "rating":
                        i11 = 10;
                        break;
                    case "userRatingsTotal":
                        i11 = 12;
                        break;
                    case "placeID":
                        i11 = 2;
                        break;
                    case "name":
                        i11 = 4;
                        break;
                    case "types":
                        i11 = 11;
                        break;
                    case "addressComponents":
                        i11 = 15;
                        break;
                    case "viewport":
                        i11 = 13;
                        break;
                    case "website":
                        i11 = 14;
                        break;
                    case "location":
                        i11 = 3;
                        break;
                    case "businessStatus":
                        i11 = 16;
                        break;
                    default:
                        i11 = 17;
                        break;
                }
            } else {
                i11 = 17;
            }
            g0 g0Var = b.f55692a.a().get(i11);
            p013kotlin.jvm.internal.s.j(g0Var, "get(...)");
            return g0Var;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/g0$b;", "", "<init>", "()V", "Landroid/util/SparseArray;", "Lcom/tesla/TeslaV4/reactnative/module/g0;", "b", "Landroid/util/SparseArray;", "a", "()Landroid/util/SparseArray;", "index", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f55692a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final SparseArray<g0> index = new SparseArray<>();

        private b() {
        }

        public final SparseArray<g0> a() {
            return index;
        }
    }

    g0(int i11, String str, Place.Field field) {
        this.key = str;
        this.field = field;
        b.f55692a.a().put(i11, this);
    }

    public static EnumEntries<g0> getEntries() {
        return $ENTRIES;
    }

    public final Place.Field getField() {
        return this.field;
    }
}
