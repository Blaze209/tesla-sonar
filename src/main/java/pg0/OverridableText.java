package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: pg0.k4, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lpg0/k4;", "Landroid/os/Parcelable;", "", "", "backingData", "<init>", "(Ljava/util/Map;)V", "countryCode", "idClass", "Lpg0/d4$e;", "side", "a", "(Ljava/lang/String;Ljava/lang/String;Lpg0/d4$e;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getBackingData", "()Ljava/util/Map;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OverridableText implements Parcelable {
    public static final Parcelable.Creator<OverridableText> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> backingData;

    /* JADX INFO: renamed from: pg0.k4$a */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpg0/k4$a;", "", "<init>", "()V", "", "countryCode", "idClass", "Lpg0/d4$e;", "side", "text", "Ljn0/h0;", "b", "(Ljava/lang/String;Ljava/lang/String;Lpg0/d4$e;Ljava/lang/String;)V", "Lpg0/k4;", "a", "()Lpg0/k4;", "", "Ljava/util/Map;", "backingData", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, String> backingData = new LinkedHashMap();

        public final OverridableText a() {
            return new OverridableText(this.backingData);
        }

        public final void b(String countryCode, String idClass, IdConfig.e side, String text) {
            p013kotlin.jvm.internal.s.k(side, "side");
            p013kotlin.jvm.internal.s.k(text, "text");
            Map<String, String> map = this.backingData;
            String str = countryCode + "-" + idClass + "-" + side.getKey();
            Locale US = Locale.US;
            p013kotlin.jvm.internal.s.j(US, "US");
            String lowerCase = str.toLowerCase(US);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, text);
        }
    }

    /* JADX INFO: renamed from: pg0.k4$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<OverridableText> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OverridableText createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new OverridableText(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OverridableText[] newArray(int i11) {
            return new OverridableText[i11];
        }
    }

    public OverridableText(Map<String, String> backingData) {
        p013kotlin.jvm.internal.s.k(backingData, "backingData");
        this.backingData = backingData;
    }

    public final String a(String countryCode, String idClass, IdConfig.e side) {
        p013kotlin.jvm.internal.s.k(side, "side");
        if (countryCode == null) {
            countryCode = "unpopulated";
        }
        if (p013kotlin.jvm.internal.s.f(idClass, wg0.e.KeyAutoClassification) || idClass == null) {
            idClass = "unpopulated";
        }
        Map<String, String> map = this.backingData;
        String str = countryCode + "-" + idClass + "-" + side.getKey();
        Locale US = Locale.US;
        p013kotlin.jvm.internal.s.j(US, "US");
        String lowerCase = str.toLowerCase(US);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        String str2 = map.get(lowerCase);
        if (str2 != null) {
            return str2;
        }
        Map<String, String> map2 = this.backingData;
        String str3 = ((String) null) + "-" + idClass + "-" + side.getKey();
        p013kotlin.jvm.internal.s.j(US, "US");
        String lowerCase2 = str3.toLowerCase(US);
        p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
        String str4 = map2.get(lowerCase2);
        if (str4 != null) {
            return str4;
        }
        Map<String, String> map3 = this.backingData;
        String str5 = ((String) null) + "-" + ((String) null) + "-" + side.getKey();
        p013kotlin.jvm.internal.s.j(US, "US");
        String lowerCase3 = str5.toLowerCase(US);
        p013kotlin.jvm.internal.s.j(lowerCase3, "toLowerCase(...)");
        String str6 = map3.get(lowerCase3);
        if (str6 != null) {
            return str6;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OverridableText) && p013kotlin.jvm.internal.s.f(this.backingData, ((OverridableText) other).backingData);
    }

    public int hashCode() {
        return this.backingData.hashCode();
    }

    public String toString() {
        return "OverridableText(backingData=" + this.backingData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        Map<String, String> map = this.backingData;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }
}
