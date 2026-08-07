package nh0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: nh0.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lnh0/e;", "Landroid/os/Parcelable;", "", "cardAccessNumber", "Lnh0/b;", "mrzKey", "Lnh0/k;", "passportNfcStrings", "", "Lnh0/c;", "enabledDataGroups", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "<init>", "(Ljava/lang/String;Lnh0/b;Lnh0/k;Ljava/util/List;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCardAccessNumber", "b", "Lnh0/b;", "getMrzKey", "()Lnh0/b;", "c", "Lnh0/k;", "getPassportNfcStrings", "()Lnh0/k;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getEnabledDataGroups", "()Ljava/util/List;", "e", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStepStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "getComponentStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassportNfcReaderConfig implements Parcelable {
    public static final Parcelable.Creator<PassportNfcReaderConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardAccessNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MrzKey mrzKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PassportNfcStrings passportNfcStrings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<c> enabledDataGroups;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer theme;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final StepStyles.UiStepStyle stepStyles;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles;

    /* JADX INFO: renamed from: nh0.e$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportNfcReaderConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PassportNfcReaderConfig createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            MrzKey mrzKeyCreateFromParcel = MrzKey.CREATOR.createFromParcel(parcel);
            PassportNfcStrings passportNfcStringsCreateFromParcel = PassportNfcStrings.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(c.valueOf(parcel.readString()));
            }
            return new PassportNfcReaderConfig(string, mrzKeyCreateFromParcel, passportNfcStringsCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (StepStyles.UiStepStyle) parcel.readParcelable(PassportNfcReaderConfig.class.getClassLoader()), (GovernmentIdNfcScan.GovernmentIdNfcScanStyles) parcel.readParcelable(PassportNfcReaderConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PassportNfcReaderConfig[] newArray(int i11) {
            return new PassportNfcReaderConfig[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassportNfcReaderConfig(String cardAccessNumber, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends c> enabledDataGroups, Integer num, StepStyles.UiStepStyle uiStepStyle, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        s.k(cardAccessNumber, "cardAccessNumber");
        s.k(mrzKey, "mrzKey");
        s.k(passportNfcStrings, "passportNfcStrings");
        s.k(enabledDataGroups, "enabledDataGroups");
        this.cardAccessNumber = cardAccessNumber;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = enabledDataGroups;
        this.theme = num;
        this.stepStyles = uiStepStyle;
        this.componentStyles = governmentIdNfcScanStyles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportNfcReaderConfig)) {
            return false;
        }
        PassportNfcReaderConfig passportNfcReaderConfig = (PassportNfcReaderConfig) other;
        return s.f(this.cardAccessNumber, passportNfcReaderConfig.cardAccessNumber) && s.f(this.mrzKey, passportNfcReaderConfig.mrzKey) && s.f(this.passportNfcStrings, passportNfcReaderConfig.passportNfcStrings) && s.f(this.enabledDataGroups, passportNfcReaderConfig.enabledDataGroups) && s.f(this.theme, passportNfcReaderConfig.theme) && s.f(this.stepStyles, passportNfcReaderConfig.stepStyles) && s.f(this.componentStyles, passportNfcReaderConfig.componentStyles);
    }

    public int hashCode() {
        int iHashCode = ((((((this.cardAccessNumber.hashCode() * 31) + this.mrzKey.hashCode()) * 31) + this.passportNfcStrings.hashCode()) * 31) + this.enabledDataGroups.hashCode()) * 31;
        Integer num = this.theme;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.stepStyles;
        int iHashCode3 = (iHashCode2 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles = this.componentStyles;
        return iHashCode3 + (governmentIdNfcScanStyles != null ? governmentIdNfcScanStyles.hashCode() : 0);
    }

    public String toString() {
        return "PassportNfcReaderConfig(cardAccessNumber=" + this.cardAccessNumber + ", mrzKey=" + this.mrzKey + ", passportNfcStrings=" + this.passportNfcStrings + ", enabledDataGroups=" + this.enabledDataGroups + ", theme=" + this.theme + ", stepStyles=" + this.stepStyles + ", componentStyles=" + this.componentStyles + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        s.k(dest, "dest");
        dest.writeString(this.cardAccessNumber);
        this.mrzKey.writeToParcel(dest, flags);
        this.passportNfcStrings.writeToParcel(dest, flags);
        List<c> list = this.enabledDataGroups;
        dest.writeInt(list.size());
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        Integer num = this.theme;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeParcelable(this.stepStyles, flags);
        dest.writeParcelable(this.componentStyles, flags);
    }
}
