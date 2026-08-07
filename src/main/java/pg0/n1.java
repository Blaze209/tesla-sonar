package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ezvcard.property.Gender;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wg0.GovernmentIdRequestArguments;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u001b\u0006\u000f\t\r\u0013\u001e!$\u0018\u000b'B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128 X \u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168 X \u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0001\n()*+,-./01¨\u00062"}, d2 = {"Lpg0/n1;", "Landroid/os/Parcelable;", "<init>", "()V", "", AnalyticsAttribute.Error, "c", "(Ljava/lang/String;)Lpg0/n1;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "", "a", "Z", "h", "()Z", "l", "(Z)V", "didGoBack", "Lpg0/i4;", "g", "()Lpg0/i4;", "currentPart", "", "Lpg0/d0;", "k", "()Ljava/util/List;", "uploadingIds", "j", "parts", "", IntegerTokenConverter.CONVERTER_KEY, "()I", "partIndex", "e", "()Lpg0/n1;", "backState", "f", "()Ljava/lang/String;", "countryCode", "b", "Lpg0/n1$a;", "Lpg0/n1$b;", "Lpg0/n1$c;", "Lpg0/n1$d;", "Lpg0/n1$e;", "Lpg0/n1$f;", "Lpg0/n1$h;", "Lpg0/n1$j;", "Lpg0/n1$k;", "Lpg0/n1$l;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class n1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean didGoBack;

    /* JADX INFO: renamed from: pg0.n1$b, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u009e\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b4\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b7\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\bA\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\bB\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u0010#¨\u0006E"}, d2 = {"Lpg0/n1$b;", "Lpg0/n1;", "Lpg0/i4$a;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "Lpg0/i4;", "parts", "", "partIndex", "backState", "", "countryCode", "Lpg0/c0;", "captureFrames", "Lzf0/u;", "cameraProperties", "Lpg0/f4;", "idConfigsForCountry", "selectedCountryCode", "selectedIdClass", "<init>", "(Lpg0/i4$a;Ljava/util/List;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Ljava/util/List;Lzf0/u;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "m", "(Lpg0/i4$a;Ljava/util/List;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Ljava/util/List;Lzf0/u;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lpg0/n1$b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/i4$a;", "s", "()Lpg0/i4$a;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "j", "e", "I", IntegerTokenConverter.CONVERTER_KEY, "f", "Lpg0/n1;", "()Lpg0/n1;", "g", "Ljava/lang/String;", "h", "getCaptureFrames", "Lzf0/u;", "r", "()Lzf0/u;", "u", "v", "l", "w", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AutoClassificationManualSelect extends n1 {
        public static final Parcelable.Creator<AutoClassificationManualSelect> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Frame> captureFrames;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<IdConfigForCountry> idConfigsForCountry;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedCountryCode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedIdClass;

        /* JADX INFO: renamed from: pg0.n1$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoClassificationManualSelect> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationManualSelect createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4.SideIdPart sideIdPartCreateFromParcel = i4.SideIdPart.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader()));
                }
                int i15 = parcel.readInt();
                n1 n1Var = (n1) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                String string = parcel.readString();
                int i16 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                zf0.u uVar = (zf0.u) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                int i18 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationManualSelect(sideIdPartCreateFromParcel, arrayList, arrayList2, i15, n1Var, string, arrayList3, uVar, arrayList4, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationManualSelect[] newArray(int i11) {
                return new AutoClassificationManualSelect[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationManualSelect(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, List<? extends i4> parts, int i11, n1 n1Var, String str, List<Frame> captureFrames, zf0.u cameraProperties, List<IdConfigForCountry> idConfigsForCountry, String str2, String str3) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(captureFrames, "captureFrames");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(idConfigsForCountry, "idConfigsForCountry");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.countryCode = str;
            this.captureFrames = captureFrames;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = idConfigsForCountry;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoClassificationManualSelect q(AutoClassificationManualSelect autoClassificationManualSelect, i4.SideIdPart sideIdPart, List list, List list2, int i11, n1 n1Var, String str, List list3, zf0.u uVar, List list4, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                sideIdPart = autoClassificationManualSelect.currentPart;
            }
            if ((i12 & 2) != 0) {
                list = autoClassificationManualSelect.uploadingIds;
            }
            if ((i12 & 4) != 0) {
                list2 = autoClassificationManualSelect.parts;
            }
            if ((i12 & 8) != 0) {
                i11 = autoClassificationManualSelect.partIndex;
            }
            if ((i12 & 16) != 0) {
                n1Var = autoClassificationManualSelect.backState;
            }
            if ((i12 & 32) != 0) {
                str = autoClassificationManualSelect.countryCode;
            }
            if ((i12 & 64) != 0) {
                list3 = autoClassificationManualSelect.captureFrames;
            }
            if ((i12 & 128) != 0) {
                uVar = autoClassificationManualSelect.cameraProperties;
            }
            if ((i12 & 256) != 0) {
                list4 = autoClassificationManualSelect.idConfigsForCountry;
            }
            if ((i12 & 512) != 0) {
                str2 = autoClassificationManualSelect.selectedCountryCode;
            }
            if ((i12 & 1024) != 0) {
                str3 = autoClassificationManualSelect.selectedIdClass;
            }
            String str4 = str2;
            String str5 = str3;
            zf0.u uVar2 = uVar;
            List list5 = list4;
            String str6 = str;
            List list6 = list3;
            n1 n1Var2 = n1Var;
            List list7 = list2;
            return autoClassificationManualSelect.m(sideIdPart, list, list7, i11, n1Var2, str6, list6, uVar2, list5, str4, str5);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClassificationManualSelect)) {
                return false;
            }
            AutoClassificationManualSelect autoClassificationManualSelect = (AutoClassificationManualSelect) other;
            return p013kotlin.jvm.internal.s.f(this.currentPart, autoClassificationManualSelect.currentPart) && p013kotlin.jvm.internal.s.f(this.uploadingIds, autoClassificationManualSelect.uploadingIds) && p013kotlin.jvm.internal.s.f(this.parts, autoClassificationManualSelect.parts) && this.partIndex == autoClassificationManualSelect.partIndex && p013kotlin.jvm.internal.s.f(this.backState, autoClassificationManualSelect.backState) && p013kotlin.jvm.internal.s.f(this.countryCode, autoClassificationManualSelect.countryCode) && p013kotlin.jvm.internal.s.f(this.captureFrames, autoClassificationManualSelect.captureFrames) && p013kotlin.jvm.internal.s.f(this.cameraProperties, autoClassificationManualSelect.cameraProperties) && p013kotlin.jvm.internal.s.f(this.idConfigsForCountry, autoClassificationManualSelect.idConfigsForCountry) && p013kotlin.jvm.internal.s.f(this.selectedCountryCode, autoClassificationManualSelect.selectedCountryCode) && p013kotlin.jvm.internal.s.f(this.selectedIdClass, autoClassificationManualSelect.selectedIdClass);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            n1 n1Var = this.backState;
            int iHashCode2 = (iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.captureFrames.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + this.idConfigsForCountry.hashCode()) * 31;
            String str2 = this.selectedCountryCode;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedIdClass;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        public final AutoClassificationManualSelect m(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, List<? extends i4> parts, int partIndex, n1 backState, String countryCode, List<Frame> captureFrames, zf0.u cameraProperties, List<IdConfigForCountry> idConfigsForCountry, String selectedCountryCode, String selectedIdClass) {
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(captureFrames, "captureFrames");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(idConfigsForCountry, "idConfigsForCountry");
            return new AutoClassificationManualSelect(currentPart, uploadingIds, parts, partIndex, backState, countryCode, captureFrames, cameraProperties, idConfigsForCountry, selectedCountryCode, selectedIdClass);
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: s, reason: from getter */
        public i4.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        public String toString() {
            return "AutoClassificationManualSelect(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ")";
        }

        public final List<IdConfigForCountry> u() {
            return this.idConfigsForCountry;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final String getSelectedIdClass() {
            return this.selectedIdClass;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            List<Frame> list3 = this.captureFrames;
            dest.writeInt(list3.size());
            Iterator<Frame> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<IdConfigForCountry> list4 = this.idConfigsForCountry;
            dest.writeInt(list4.size());
            Iterator<IdConfigForCountry> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.selectedCountryCode);
            dest.writeString(this.selectedIdClass);
        }
    }

    /* JADX INFO: renamed from: pg0.n1$d, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u00101R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b5\u0010@R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\b9\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b:\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lpg0/n1$d;", "Lpg0/n1;", "Lpg0/i4$a;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "Lpg0/q;", "captureConfig", "Lpg0/d0$b;", "idForReview", "Lpg0/i4;", "parts", "", "partIndex", "backState", "", "countryCode", "Lvg0/d;", "hint", "<init>", "(Lpg0/i4$a;Ljava/util/List;Lpg0/q;Lpg0/d0$b;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Lvg0/d;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "m", "(Lpg0/i4$a;Ljava/util/List;Lpg0/q;Lpg0/d0$b;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Lvg0/d;)Lpg0/n1$d;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/i4$a;", "s", "()Lpg0/i4$a;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", "Lpg0/q;", "r", "()Lpg0/q;", "e", "Lpg0/d0$b;", "v", "()Lpg0/d0$b;", "f", "j", "g", "I", IntegerTokenConverter.CONVERTER_KEY, "h", "Lpg0/n1;", "()Lpg0/n1;", "Ljava/lang/String;", "Lvg0/d;", "u", "()Lvg0/d;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountdownToCapture extends n1 {
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final d0.GovernmentIdImage idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final vg0.d hint;

        /* JADX INFO: renamed from: pg0.n1$d$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4.SideIdPart sideIdPartCreateFromParcel = i4.SideIdPart.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                q qVar = (q) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                d0.GovernmentIdImage governmentIdImageCreateFromParcel = d0.GovernmentIdImage.CREATOR.createFromParcel(parcel);
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                return new CountdownToCapture(sideIdPartCreateFromParcel, arrayList, qVar, governmentIdImageCreateFromParcel, arrayList2, parcel.readInt(), (n1) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), parcel.readString(), (vg0.d) parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture[] newArray(int i11) {
                return new CountdownToCapture[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToCapture(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, q captureConfig, d0.GovernmentIdImage idForReview, List<? extends i4> parts, int i11, n1 n1Var, String str, vg0.d dVar) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            p013kotlin.jvm.internal.s.k(idForReview, "idForReview");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.countryCode = str;
            this.hint = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CountdownToCapture q(CountdownToCapture countdownToCapture, i4.SideIdPart sideIdPart, List list, q qVar, d0.GovernmentIdImage governmentIdImage, List list2, int i11, n1 n1Var, String str, vg0.d dVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                sideIdPart = countdownToCapture.currentPart;
            }
            if ((i12 & 2) != 0) {
                list = countdownToCapture.uploadingIds;
            }
            if ((i12 & 4) != 0) {
                qVar = countdownToCapture.captureConfig;
            }
            if ((i12 & 8) != 0) {
                governmentIdImage = countdownToCapture.idForReview;
            }
            if ((i12 & 16) != 0) {
                list2 = countdownToCapture.parts;
            }
            if ((i12 & 32) != 0) {
                i11 = countdownToCapture.partIndex;
            }
            if ((i12 & 64) != 0) {
                n1Var = countdownToCapture.backState;
            }
            if ((i12 & 128) != 0) {
                str = countdownToCapture.countryCode;
            }
            if ((i12 & 256) != 0) {
                dVar = countdownToCapture.hint;
            }
            String str2 = str;
            vg0.d dVar2 = dVar;
            int i13 = i11;
            n1 n1Var2 = n1Var;
            List list3 = list2;
            q qVar2 = qVar;
            return countdownToCapture.m(sideIdPart, list, qVar2, governmentIdImage, list3, i13, n1Var2, str2, dVar2);
        }

        @Override // pg0.n1
        public void d() {
            super.d();
            Iterator<T> it = this.idForReview.G3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) other;
            return p013kotlin.jvm.internal.s.f(this.currentPart, countdownToCapture.currentPart) && p013kotlin.jvm.internal.s.f(this.uploadingIds, countdownToCapture.uploadingIds) && p013kotlin.jvm.internal.s.f(this.captureConfig, countdownToCapture.captureConfig) && p013kotlin.jvm.internal.s.f(this.idForReview, countdownToCapture.idForReview) && p013kotlin.jvm.internal.s.f(this.parts, countdownToCapture.parts) && this.partIndex == countdownToCapture.partIndex && p013kotlin.jvm.internal.s.f(this.backState, countdownToCapture.backState) && p013kotlin.jvm.internal.s.f(this.countryCode, countdownToCapture.countryCode) && p013kotlin.jvm.internal.s.f(this.hint, countdownToCapture.hint);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            n1 n1Var = this.backState;
            int iHashCode2 = (iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            vg0.d dVar = this.hint;
            return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        public final CountdownToCapture m(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, q captureConfig, d0.GovernmentIdImage idForReview, List<? extends i4> parts, int partIndex, n1 backState, String countryCode, vg0.d hint) {
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            p013kotlin.jvm.internal.s.k(idForReview, "idForReview");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            return new CountdownToCapture(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, countryCode, hint);
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final q getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: s, reason: from getter */
        public i4.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        public String toString() {
            return "CountdownToCapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final vg0.d getHint() {
            return this.hint;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final d0.GovernmentIdImage getIdForReview() {
            return this.idForReview;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            this.idForReview.writeToParcel(dest, flags);
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.hint, flags);
        }
    }

    /* JADX INFO: renamed from: pg0.n1$e, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0086\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010&\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u00109\u001a\u0004\b4\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b6\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b5\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lpg0/n1$e;", "Lpg0/n1;", "Lpg0/d4;", "id", "", "Lpg0/d0;", "uploadingIds", "Lpg0/i4;", "currentPart", "parts", "", "partIndex", "backState", "", "countryCode", "Lwg0/c;", "governmentIdRequestArguments", "", "minDurationMs", "", "isDelayComplete", "<init>", "(Lpg0/d4;Ljava/util/List;Lpg0/i4;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Lwg0/c;JZ)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "m", "(Lpg0/d4;Ljava/util/List;Lpg0/i4;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Lwg0/c;JZ)Lpg0/n1$e;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/d4;", "r", "()Lpg0/d4;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lpg0/i4;", "g", "()Lpg0/i4;", "e", "j", "f", "I", IntegerTokenConverter.CONVERTER_KEY, "Lpg0/n1;", "()Lpg0/n1;", "h", "Ljava/lang/String;", "Lwg0/c;", "getGovernmentIdRequestArguments", "()Lwg0/c;", "J", "s", "()J", "Z", "u", "()Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinalizeLocalVideoCapture extends n1 {
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdConfig id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4 currentPart;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final GovernmentIdRequestArguments governmentIdRequestArguments;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final long minDurationMs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isDelayComplete;

        /* JADX INFO: renamed from: pg0.n1$e$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeLocalVideoCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                IdConfig idConfigCreateFromParcel = IdConfig.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                i4 i4Var = (i4) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                return new FinalizeLocalVideoCapture(idConfigCreateFromParcel, arrayList, i4Var, arrayList2, parcel.readInt(), (n1) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture[] newArray(int i11) {
                return new FinalizeLocalVideoCapture[i11];
            }
        }

        public /* synthetic */ FinalizeLocalVideoCapture(IdConfig idConfig, List list, i4 i4Var, List list2, int i11, n1 n1Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, i4Var, list2, i11, (i12 & 32) != 0 ? null : n1Var, str, (i12 & 128) != 0 ? null : governmentIdRequestArguments, (i12 & 256) != 0 ? 3000L : j11, (i12 & 512) != 0 ? false : z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinalizeLocalVideoCapture q(FinalizeLocalVideoCapture finalizeLocalVideoCapture, IdConfig idConfig, List list, i4 i4Var, List list2, int i11, n1 n1Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j11, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                idConfig = finalizeLocalVideoCapture.id;
            }
            if ((i12 & 2) != 0) {
                list = finalizeLocalVideoCapture.uploadingIds;
            }
            if ((i12 & 4) != 0) {
                i4Var = finalizeLocalVideoCapture.currentPart;
            }
            if ((i12 & 8) != 0) {
                list2 = finalizeLocalVideoCapture.parts;
            }
            if ((i12 & 16) != 0) {
                i11 = finalizeLocalVideoCapture.partIndex;
            }
            if ((i12 & 32) != 0) {
                n1Var = finalizeLocalVideoCapture.backState;
            }
            if ((i12 & 64) != 0) {
                str = finalizeLocalVideoCapture.countryCode;
            }
            if ((i12 & 128) != 0) {
                governmentIdRequestArguments = finalizeLocalVideoCapture.governmentIdRequestArguments;
            }
            if ((i12 & 256) != 0) {
                j11 = finalizeLocalVideoCapture.minDurationMs;
            }
            if ((i12 & 512) != 0) {
                z11 = finalizeLocalVideoCapture.isDelayComplete;
            }
            boolean z12 = z11;
            long j12 = j11;
            String str2 = str;
            GovernmentIdRequestArguments governmentIdRequestArguments2 = governmentIdRequestArguments;
            int i13 = i11;
            n1 n1Var2 = n1Var;
            return finalizeLocalVideoCapture.m(idConfig, list, i4Var, list2, i13, n1Var2, str2, governmentIdRequestArguments2, j12, z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) other;
            return p013kotlin.jvm.internal.s.f(this.id, finalizeLocalVideoCapture.id) && p013kotlin.jvm.internal.s.f(this.uploadingIds, finalizeLocalVideoCapture.uploadingIds) && p013kotlin.jvm.internal.s.f(this.currentPart, finalizeLocalVideoCapture.currentPart) && p013kotlin.jvm.internal.s.f(this.parts, finalizeLocalVideoCapture.parts) && this.partIndex == finalizeLocalVideoCapture.partIndex && p013kotlin.jvm.internal.s.f(this.backState, finalizeLocalVideoCapture.backState) && p013kotlin.jvm.internal.s.f(this.countryCode, finalizeLocalVideoCapture.countryCode) && p013kotlin.jvm.internal.s.f(this.governmentIdRequestArguments, finalizeLocalVideoCapture.governmentIdRequestArguments) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: g, reason: from getter */
        public i4 getCurrentPart() {
            return this.currentPart;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            n1 n1Var = this.backState;
            int iHashCode2 = (iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            return ((((iHashCode3 + (governmentIdRequestArguments != null ? governmentIdRequestArguments.hashCode() : 0)) * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        public final FinalizeLocalVideoCapture m(IdConfig id2, List<? extends d0> uploadingIds, i4 currentPart, List<? extends i4> parts, int partIndex, n1 backState, String countryCode, GovernmentIdRequestArguments governmentIdRequestArguments, long minDurationMs, boolean isDelayComplete) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            return new FinalizeLocalVideoCapture(id2, uploadingIds, currentPart, parts, partIndex, backState, countryCode, governmentIdRequestArguments, minDurationMs, isDelayComplete);
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final IdConfig getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        public String toString() {
            return "FinalizeLocalVideoCapture(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.id.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.currentPart, flags);
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdRequestArguments.writeToParcel(dest, flags);
            }
            dest.writeLong(this.minDurationMs);
            dest.writeInt(this.isDelayComplete ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeLocalVideoCapture(IdConfig id2, List<? extends d0> uploadingIds, i4 currentPart, List<? extends i4> parts, int i11, n1 n1Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j11, boolean z11) {
            super(null);
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            this.id = id2;
            this.uploadingIds = uploadingIds;
            this.currentPart = currentPart;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.minDurationMs = j11;
            this.isDelayComplete = z11;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b%\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b(\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lpg0/n1$f;", "Lpg0/n1;", "Lpg0/i4;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "parts", "", "partIndex", "backState", "", "countryCode", "Lpg0/d4;", "id", "Lzf0/u;", "cameraProperties", "<init>", "(Lpg0/i4;Ljava/util/List;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Lpg0/d4;Lzf0/u;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "Lpg0/i4;", "g", "()Lpg0/i4;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "j", "e", "I", IntegerTokenConverter.CONVERTER_KEY, "f", "Lpg0/n1;", "()Lpg0/n1;", "Ljava/lang/String;", "()Ljava/lang/String;", "h", "Lpg0/d4;", "q", "()Lpg0/d4;", "Lzf0/u;", "m", "()Lzf0/u;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends n1 {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final i4 currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<i4> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final n1 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final IdConfig id;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final zf0.u cameraProperties;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4 i4Var = (i4) parcel.readParcelable(f.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(f.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(f.class.getClassLoader()));
                }
                return new f(i4Var, arrayList, arrayList2, parcel.readInt(), (n1) parcel.readParcelable(f.class.getClassLoader()), parcel.readString(), IdConfig.CREATOR.createFromParcel(parcel), (zf0.u) parcel.readParcelable(f.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i11) {
                return new f[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(i4 currentPart, List<? extends d0> uploadingIds, List<? extends i4> parts, int i11, n1 n1Var, String str, IdConfig id2, zf0.u cameraProperties) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.countryCode = str;
            this.id = id2;
            this.cameraProperties = cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: g, reason: from getter */
        public i4 getCurrentPart() {
            return this.currentPart;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final IdConfig getId() {
            return this.id;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            this.id.writeToParcel(dest, flags);
            dest.writeParcelable(this.cameraProperties, flags);
        }
    }

    /* JADX INFO: renamed from: pg0.n1$g, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0090\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010%J\u001a\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\b8\u00109R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u00106R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b:\u0010ER\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b?\u0010I\u001a\u0004\bJ\u0010)R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0010X\u0090\u0004¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\b>\u0010)¨\u0006O"}, d2 = {"Lpg0/n1$g;", "Lpg0/n1$h;", "Lpg0/i4$a;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "Lpg0/q;", "captureConfig", "idForReview", "Lpg0/i4;", "parts", "", "partIndex", "Lpg0/n1;", "backState", "Lzf0/u;", "cameraProperties", "", AnalyticsAttribute.Error, "", "submittingForAutoClassification", "countryCode", "<init>", "(Lpg0/i4$a;Ljava/util/List;Lpg0/q;Lpg0/d0;Ljava/util/List;ILpg0/n1;Lzf0/u;Ljava/lang/String;ZLjava/lang/String;)V", "newValue", "u", "(Z)Lpg0/n1$h;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "v", "(Lpg0/i4$a;Ljava/util/List;Lpg0/q;Lpg0/d0;Ljava/util/List;ILpg0/n1;Lzf0/u;Ljava/lang/String;ZLjava/lang/String;)Lpg0/n1$g;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/i4$a;", "r", "()Lpg0/i4$a;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", "Lpg0/q;", "q", "()Lpg0/q;", "e", "Lpg0/d0;", "s", "()Lpg0/d0;", "f", "j", "g", "I", IntegerTokenConverter.CONVERTER_KEY, "h", "Lpg0/n1;", "()Lpg0/n1;", "Lzf0/u;", "m", "()Lzf0/u;", "Ljava/lang/String;", "x", "Z", "y", "()Z", "l", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewCapturedImage extends h {
        public static final Parcelable.Creator<ReviewCapturedImage> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final d0 idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean submittingForAutoClassification;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: pg0.n1$g$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewCapturedImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReviewCapturedImage createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4.SideIdPart sideIdPartCreateFromParcel = i4.SideIdPart.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                q qVar = (q) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                d0 d0Var = (d0) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                return new ReviewCapturedImage(sideIdPartCreateFromParcel, arrayList, qVar, d0Var, arrayList2, parcel.readInt(), (n1) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), (zf0.u) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReviewCapturedImage[] newArray(int i11) {
                return new ReviewCapturedImage[i11];
            }
        }

        public /* synthetic */ ReviewCapturedImage(i4.SideIdPart sideIdPart, List list, q qVar, d0 d0Var, List list2, int i11, n1 n1Var, zf0.u uVar, String str, boolean z11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, qVar, d0Var, list2, i11, n1Var, uVar, (i12 & 256) != 0 ? null : str, (i12 & 512) != 0 ? false : z11, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReviewCapturedImage w(ReviewCapturedImage reviewCapturedImage, i4.SideIdPart sideIdPart, List list, q qVar, d0 d0Var, List list2, int i11, n1 n1Var, zf0.u uVar, String str, boolean z11, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                sideIdPart = reviewCapturedImage.currentPart;
            }
            if ((i12 & 2) != 0) {
                list = reviewCapturedImage.uploadingIds;
            }
            if ((i12 & 4) != 0) {
                qVar = reviewCapturedImage.captureConfig;
            }
            if ((i12 & 8) != 0) {
                d0Var = reviewCapturedImage.idForReview;
            }
            if ((i12 & 16) != 0) {
                list2 = reviewCapturedImage.parts;
            }
            if ((i12 & 32) != 0) {
                i11 = reviewCapturedImage.partIndex;
            }
            if ((i12 & 64) != 0) {
                n1Var = reviewCapturedImage.backState;
            }
            if ((i12 & 128) != 0) {
                uVar = reviewCapturedImage.cameraProperties;
            }
            if ((i12 & 256) != 0) {
                str = reviewCapturedImage.error;
            }
            if ((i12 & 512) != 0) {
                z11 = reviewCapturedImage.submittingForAutoClassification;
            }
            if ((i12 & 1024) != 0) {
                str2 = reviewCapturedImage.countryCode;
            }
            boolean z12 = z11;
            String str3 = str2;
            zf0.u uVar2 = uVar;
            String str4 = str;
            int i13 = i11;
            n1 n1Var2 = n1Var;
            List list3 = list2;
            q qVar2 = qVar;
            return reviewCapturedImage.v(sideIdPart, list, qVar2, d0Var, list3, i13, n1Var2, uVar2, str4, z12, str3);
        }

        @Override // pg0.n1
        public void d() {
            super.d();
            Iterator<T> it = getIdForReview().G3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewCapturedImage)) {
                return false;
            }
            ReviewCapturedImage reviewCapturedImage = (ReviewCapturedImage) other;
            return p013kotlin.jvm.internal.s.f(this.currentPart, reviewCapturedImage.currentPart) && p013kotlin.jvm.internal.s.f(this.uploadingIds, reviewCapturedImage.uploadingIds) && p013kotlin.jvm.internal.s.f(this.captureConfig, reviewCapturedImage.captureConfig) && p013kotlin.jvm.internal.s.f(this.idForReview, reviewCapturedImage.idForReview) && p013kotlin.jvm.internal.s.f(this.parts, reviewCapturedImage.parts) && this.partIndex == reviewCapturedImage.partIndex && p013kotlin.jvm.internal.s.f(this.backState, reviewCapturedImage.backState) && p013kotlin.jvm.internal.s.f(this.cameraProperties, reviewCapturedImage.cameraProperties) && p013kotlin.jvm.internal.s.f(this.error, reviewCapturedImage.error) && this.submittingForAutoClassification == reviewCapturedImage.submittingForAutoClassification && p013kotlin.jvm.internal.s.f(this.countryCode, reviewCapturedImage.countryCode);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            n1 n1Var = this.backState;
            int iHashCode2 = (((iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str = this.error;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.submittingForAutoClassification)) * 31;
            String str2 = this.countryCode;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        @Override // pg0.n1.h
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // pg0.n1.h
        /* JADX INFO: renamed from: q, reason: from getter */
        public q getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: r, reason: from getter */
        public i4.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // pg0.n1.h
        /* JADX INFO: renamed from: s, reason: from getter */
        public d0 getIdForReview() {
            return this.idForReview;
        }

        public String toString() {
            return "ReviewCapturedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ", countryCode=" + this.countryCode + ")";
        }

        @Override // pg0.n1.h
        public h u(boolean newValue) {
            return w(this, null, null, null, null, null, 0, null, null, null, newValue, null, 1535, null);
        }

        public final ReviewCapturedImage v(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, q captureConfig, d0 idForReview, List<? extends i4> parts, int partIndex, n1 backState, zf0.u cameraProperties, String error, boolean submittingForAutoClassification, String countryCode) {
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            p013kotlin.jvm.internal.s.k(idForReview, "idForReview");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            return new ReviewCapturedImage(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification, countryCode);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.idForReview, flags);
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeString(this.error);
            dest.writeInt(this.submittingForAutoClassification ? 1 : 0);
            dest.writeString(this.countryCode);
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewCapturedImage(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, q captureConfig, d0 idForReview, List<? extends i4> parts, int i11, n1 n1Var, zf0.u cameraProperties, String str, boolean z11, String str2) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            p013kotlin.jvm.internal.s.k(idForReview, "idForReview");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.cameraProperties = cameraProperties;
            this.error = str;
            this.submittingForAutoClassification = z11;
            this.countryCode = str2;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8 X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lpg0/n1$h;", "Lpg0/n1;", "<init>", "()V", "", "newValue", "u", "(Z)Lpg0/n1$h;", "Lpg0/i4$a;", "r", "()Lpg0/i4$a;", "currentPart", "Lpg0/q;", "q", "()Lpg0/q;", "captureConfig", "Lpg0/d0;", "s", "()Lpg0/d0;", "idForReview", "Lzf0/u;", "m", "()Lzf0/u;", "cameraProperties", "Lpg0/n1$g;", "Lpg0/n1$i;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class h extends n1 {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: m */
        public abstract zf0.u getCameraProperties();

        /* JADX INFO: renamed from: q */
        public abstract q getCaptureConfig();

        /* JADX INFO: renamed from: r */
        public abstract i4.SideIdPart getCurrentPart();

        /* JADX INFO: renamed from: s */
        public abstract d0 getIdForReview();

        public abstract h u(boolean newValue);

        private h() {
            super(null);
        }
    }

    public /* synthetic */ n1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final n1 c(String error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        if (this instanceof ReviewCapturedImage) {
            return ReviewCapturedImage.w((ReviewCapturedImage) this, null, null, null, null, null, 0, null, null, error, false, null, 1791, null);
        }
        if (this instanceof ReviewSelectedImage) {
            return ReviewSelectedImage.w((ReviewSelectedImage) this, null, null, null, null, null, null, 0, null, null, error, false, null, 3583, null);
        }
        if (this instanceof ChooseCaptureMethod) {
            return ChooseCaptureMethod.q((ChooseCaptureMethod) this, null, null, null, 0, null, null, false, null, error, 255, null);
        }
        return this instanceof ShowInstructions ? ShowInstructions.q((ShowInstructions) this, null, null, null, null, 0, null, null, error, 127, null) : this;
    }

    public void d() {
        Iterator<T> it = k().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((d0) it.next()).G3().iterator();
            while (it2.hasNext()) {
                new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract n1 getBackState();

    /* JADX INFO: renamed from: f */
    public abstract String getCountryCode();

    /* JADX INFO: renamed from: g */
    public abstract i4 getCurrentPart();

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    /* JADX INFO: renamed from: i */
    public abstract int getPartIndex();

    public abstract List<i4> j();

    public abstract List<d0> k();

    public final void l(boolean z11) {
        this.didGoBack = z11;
    }

    /* JADX INFO: renamed from: pg0.n1$i, reason: from toString */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010.\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010*R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u00107R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b;\u0010HR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\bL\u0010*R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\b?\u0010*¨\u0006Q"}, d2 = {"Lpg0/n1$i;", "Lpg0/n1$h;", "Lpg0/i4$a;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "Lpg0/q;", "captureConfig", "idForReview", "", "fileName", "Lpg0/i4;", "parts", "", "partIndex", "Lpg0/n1;", "backState", "Lzf0/u;", "cameraProperties", AnalyticsAttribute.Error, "", "submittingForAutoClassification", "countryCode", "<init>", "(Lpg0/i4$a;Ljava/util/List;Lpg0/q;Lpg0/d0;Ljava/lang/String;Ljava/util/List;ILpg0/n1;Lzf0/u;Ljava/lang/String;ZLjava/lang/String;)V", "newValue", "u", "(Z)Lpg0/n1$h;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "v", "(Lpg0/i4$a;Ljava/util/List;Lpg0/q;Lpg0/d0;Ljava/lang/String;Ljava/util/List;ILpg0/n1;Lzf0/u;Ljava/lang/String;ZLjava/lang/String;)Lpg0/n1$i;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/i4$a;", "r", "()Lpg0/i4$a;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", "Lpg0/q;", "q", "()Lpg0/q;", "e", "Lpg0/d0;", "s", "()Lpg0/d0;", "f", "Ljava/lang/String;", "y", "g", "j", "h", "I", IntegerTokenConverter.CONVERTER_KEY, "Lpg0/n1;", "()Lpg0/n1;", "Lzf0/u;", "m", "()Lzf0/u;", "x", "l", "Z", "z", "()Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewSelectedImage extends h {
        public static final Parcelable.Creator<ReviewSelectedImage> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final d0 idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean submittingForAutoClassification;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: pg0.n1$i$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewSelectedImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReviewSelectedImage createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4.SideIdPart sideIdPartCreateFromParcel = i4.SideIdPart.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                q qVar = (q) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                d0 d0Var = (d0) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                String string = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                return new ReviewSelectedImage(sideIdPartCreateFromParcel, arrayList, qVar, d0Var, string, arrayList2, parcel.readInt(), (n1) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), (zf0.u) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReviewSelectedImage[] newArray(int i11) {
                return new ReviewSelectedImage[i11];
            }
        }

        public /* synthetic */ ReviewSelectedImage(i4.SideIdPart sideIdPart, List list, q qVar, d0 d0Var, String str, List list2, int i11, n1 n1Var, zf0.u uVar, String str2, boolean z11, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, qVar, d0Var, str, list2, i11, n1Var, (i12 & 256) != 0 ? new zf0.u(null, null, null, 0, 15, null) : uVar, (i12 & 512) != 0 ? null : str2, (i12 & 1024) != 0 ? false : z11, str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReviewSelectedImage w(ReviewSelectedImage reviewSelectedImage, i4.SideIdPart sideIdPart, List list, q qVar, d0 d0Var, String str, List list2, int i11, n1 n1Var, zf0.u uVar, String str2, boolean z11, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                sideIdPart = reviewSelectedImage.currentPart;
            }
            if ((i12 & 2) != 0) {
                list = reviewSelectedImage.uploadingIds;
            }
            if ((i12 & 4) != 0) {
                qVar = reviewSelectedImage.captureConfig;
            }
            if ((i12 & 8) != 0) {
                d0Var = reviewSelectedImage.idForReview;
            }
            if ((i12 & 16) != 0) {
                str = reviewSelectedImage.fileName;
            }
            if ((i12 & 32) != 0) {
                list2 = reviewSelectedImage.parts;
            }
            if ((i12 & 64) != 0) {
                i11 = reviewSelectedImage.partIndex;
            }
            if ((i12 & 128) != 0) {
                n1Var = reviewSelectedImage.backState;
            }
            if ((i12 & 256) != 0) {
                uVar = reviewSelectedImage.cameraProperties;
            }
            if ((i12 & 512) != 0) {
                str2 = reviewSelectedImage.error;
            }
            if ((i12 & 1024) != 0) {
                z11 = reviewSelectedImage.submittingForAutoClassification;
            }
            if ((i12 & 2048) != 0) {
                str3 = reviewSelectedImage.countryCode;
            }
            boolean z12 = z11;
            String str4 = str3;
            zf0.u uVar2 = uVar;
            String str5 = str2;
            int i13 = i11;
            n1 n1Var2 = n1Var;
            String str6 = str;
            List list3 = list2;
            return reviewSelectedImage.v(sideIdPart, list, qVar, d0Var, str6, list3, i13, n1Var2, uVar2, str5, z12, str4);
        }

        @Override // pg0.n1
        public void d() {
            super.d();
            Iterator<T> it = getIdForReview().G3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewSelectedImage)) {
                return false;
            }
            ReviewSelectedImage reviewSelectedImage = (ReviewSelectedImage) other;
            return p013kotlin.jvm.internal.s.f(this.currentPart, reviewSelectedImage.currentPart) && p013kotlin.jvm.internal.s.f(this.uploadingIds, reviewSelectedImage.uploadingIds) && p013kotlin.jvm.internal.s.f(this.captureConfig, reviewSelectedImage.captureConfig) && p013kotlin.jvm.internal.s.f(this.idForReview, reviewSelectedImage.idForReview) && p013kotlin.jvm.internal.s.f(this.fileName, reviewSelectedImage.fileName) && p013kotlin.jvm.internal.s.f(this.parts, reviewSelectedImage.parts) && this.partIndex == reviewSelectedImage.partIndex && p013kotlin.jvm.internal.s.f(this.backState, reviewSelectedImage.backState) && p013kotlin.jvm.internal.s.f(this.cameraProperties, reviewSelectedImage.cameraProperties) && p013kotlin.jvm.internal.s.f(this.error, reviewSelectedImage.error) && this.submittingForAutoClassification == reviewSelectedImage.submittingForAutoClassification && p013kotlin.jvm.internal.s.f(this.countryCode, reviewSelectedImage.countryCode);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31;
            String str = this.fileName;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            n1 n1Var = this.backState;
            int iHashCode3 = (((iHashCode2 + (n1Var == null ? 0 : n1Var.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str2 = this.error;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.submittingForAutoClassification)) * 31;
            String str3 = this.countryCode;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        @Override // pg0.n1.h
        /* JADX INFO: renamed from: m, reason: from getter */
        public zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // pg0.n1.h
        /* JADX INFO: renamed from: q, reason: from getter */
        public q getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: r, reason: from getter */
        public i4.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // pg0.n1.h
        /* JADX INFO: renamed from: s, reason: from getter */
        public d0 getIdForReview() {
            return this.idForReview;
        }

        public String toString() {
            return "ReviewSelectedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", fileName=" + this.fileName + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ", countryCode=" + this.countryCode + ")";
        }

        @Override // pg0.n1.h
        public h u(boolean newValue) {
            return w(this, null, null, null, null, null, null, 0, null, null, null, newValue, null, 3071, null);
        }

        public final ReviewSelectedImage v(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, q captureConfig, d0 idForReview, String fileName, List<? extends i4> parts, int partIndex, n1 backState, zf0.u cameraProperties, String error, boolean submittingForAutoClassification, String countryCode) {
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            p013kotlin.jvm.internal.s.k(idForReview, "idForReview");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            return new ReviewSelectedImage(currentPart, uploadingIds, captureConfig, idForReview, fileName, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification, countryCode);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.idForReview, flags);
            dest.writeString(this.fileName);
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeString(this.error);
            dest.writeInt(this.submittingForAutoClassification ? 1 : 0);
            dest.writeString(this.countryCode);
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewSelectedImage(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, q captureConfig, d0 idForReview, String str, List<? extends i4> parts, int i11, n1 n1Var, zf0.u cameraProperties, String str2, boolean z11, String str3) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            p013kotlin.jvm.internal.s.k(idForReview, "idForReview");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.fileName = str;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.cameraProperties = cameraProperties;
            this.error = str2;
            this.submittingForAutoClassification = z11;
            this.countryCode = str3;
        }
    }

    /* JADX INFO: renamed from: pg0.n1$k, reason: from toString */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00107\u001a\u0004\b2\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b>\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lpg0/n1$k;", "Lpg0/n1;", "Lpg0/d4;", "id", "", "Lpg0/d0;", "uploadingIds", "Lpg0/i4;", "currentPart", "parts", "", "partIndex", "backState", "", "countryCode", "Lwg0/c;", "governmentIdRequestArguments", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "<init>", "(Lpg0/d4;Ljava/util/List;Lpg0/i4;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Lwg0/c;Ljava/lang/String;Lzf0/u;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/d4;", "getId", "()Lpg0/d4;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lpg0/i4;", "g", "()Lpg0/i4;", "e", "j", "f", "I", IntegerTokenConverter.CONVERTER_KEY, "Lpg0/n1;", "()Lpg0/n1;", "h", "Ljava/lang/String;", "Lwg0/c;", "q", "()Lwg0/c;", "r", "Lzf0/u;", "m", "()Lzf0/u;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Submit extends n1 {
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdConfig id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4 currentPart;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final GovernmentIdRequestArguments governmentIdRequestArguments;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String webRtcObjectId;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: pg0.n1$k$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Submit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Submit createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                IdConfig idConfigCreateFromParcel = IdConfig.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                i4 i4Var = (i4) parcel.readParcelable(Submit.class.getClassLoader());
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                return new Submit(idConfigCreateFromParcel, arrayList, i4Var, arrayList2, parcel.readInt(), (n1) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readString(), (zf0.u) parcel.readParcelable(Submit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Submit[] newArray(int i11) {
                return new Submit[i11];
            }
        }

        public /* synthetic */ Submit(IdConfig idConfig, List list, i4 i4Var, List list2, int i11, n1 n1Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, zf0.u uVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, (i12 & 4) != 0 ? new i4.SideIdPart(IdConfig.e.Front) : i4Var, list2, i11, (i12 & 32) != 0 ? null : n1Var, str, (i12 & 128) != 0 ? null : governmentIdRequestArguments, str2, uVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) other;
            return p013kotlin.jvm.internal.s.f(this.id, submit.id) && p013kotlin.jvm.internal.s.f(this.uploadingIds, submit.uploadingIds) && p013kotlin.jvm.internal.s.f(this.currentPart, submit.currentPart) && p013kotlin.jvm.internal.s.f(this.parts, submit.parts) && this.partIndex == submit.partIndex && p013kotlin.jvm.internal.s.f(this.backState, submit.backState) && p013kotlin.jvm.internal.s.f(this.countryCode, submit.countryCode) && p013kotlin.jvm.internal.s.f(this.governmentIdRequestArguments, submit.governmentIdRequestArguments) && p013kotlin.jvm.internal.s.f(this.webRtcObjectId, submit.webRtcObjectId) && p013kotlin.jvm.internal.s.f(this.cameraProperties, submit.cameraProperties);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: g, reason: from getter */
        public i4 getCurrentPart() {
            return this.currentPart;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            n1 n1Var = this.backState;
            int iHashCode2 = (iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            int iHashCode4 = (iHashCode3 + (governmentIdRequestArguments == null ? 0 : governmentIdRequestArguments.hashCode())) * 31;
            String str2 = this.webRtcObjectId;
            return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.cameraProperties.hashCode();
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final zf0.u getCameraProperties() {
            return this.cameraProperties;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final GovernmentIdRequestArguments getGovernmentIdRequestArguments() {
            return this.governmentIdRequestArguments;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        public String toString() {
            return "Submit(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", webRtcObjectId=" + this.webRtcObjectId + ", cameraProperties=" + this.cameraProperties + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.id.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.currentPart, flags);
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdRequestArguments.writeToParcel(dest, flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submit(IdConfig id2, List<? extends d0> uploadingIds, i4 currentPart, List<? extends i4> parts, int i11, n1 n1Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, zf0.u cameraProperties) {
            super(null);
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            this.id = id2;
            this.uploadingIds = uploadingIds;
            this.currentPart = currentPart;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.webRtcObjectId = str2;
            this.cameraProperties = cameraProperties;
        }
    }

    /* JADX INFO: renamed from: pg0.n1$l, reason: from toString */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B§\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010%J\u001d\u0010*\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-JÄ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u0010-J\u001a\u00105\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b8\u00109R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u001a\u0010\u0010\u001a\u00020\u000f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bB\u0010MR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bG\u0010Q\u001a\u0004\bR\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b<\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010\u001a\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\\\u0010Q\u001a\u0004\bF\u00101R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\u0012\n\u0004\ba\u0010b\u0012\u0004\be\u0010f\u001a\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lpg0/n1$l;", "Lpg0/n1;", "Lpg0/d;", "Lpg0/b;", "Lpg0/i4$a;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "Lpg0/q;", "captureConfig", "Lpg0/g5$b$a;", "manualCapture", "Lpg0/i4;", "parts", "", "partIndex", "backState", "Lxg0/v;", "webRtcState", "", "webRtcJwt", "", AnalyticsAttribute.Error, "", "checkCameraPermissions", "checkAudioPermissions", "countryCode", "Lvg0/d;", "hint", "Lkotlin/Function0;", "Ljn0/h0;", "webRtcConnectionEstablished", "<init>", "(Lpg0/i4$a;Ljava/util/List;Lpg0/q;Lpg0/g5$b$a;Ljava/util/List;ILpg0/n1;Lxg0/v;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lvg0/d;Lwn0/a;)V", "newValue", "b", "(Z)Lpg0/n1;", "a", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "r", "(Lpg0/i4$a;Ljava/util/List;Lpg0/q;Lpg0/g5$b$a;Ljava/util/List;ILpg0/n1;Lxg0/v;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lvg0/d;Lwn0/a;)Lpg0/n1$l;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lpg0/i4$a;", "x", "()Lpg0/i4$a;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lpg0/q;", "u", "()Lpg0/q;", "e", "Lpg0/g5$b$a;", "A", "()Lpg0/g5$b$a;", "f", "j", "g", "I", IntegerTokenConverter.CONVERTER_KEY, "h", "Lpg0/n1;", "()Lpg0/n1;", "Lxg0/v;", Gender.FEMALE, "()Lxg0/v;", "Ljava/lang/String;", "E", "Ljava/lang/Throwable;", "y", "()Ljava/lang/Throwable;", "l", "Z", "w", "()Z", "m", "v", "n", "o", "Lvg0/d;", "z", "()Lvg0/d;", "p", "Lwn0/a;", "D", "()Lwn0/a;", "getWebRtcConnectionEstablished$annotations", "()V", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WaitForAutocapture extends n1 implements d, b {
        public static final Parcelable.Creator<WaitForAutocapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final g5.b.a manualCapture;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final xg0.v webRtcState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String webRtcJwt;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean checkCameraPermissions;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean checkAudioPermissions;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final vg0.d hint;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.a<jn0.h0> webRtcConnectionEstablished;

        /* JADX INFO: renamed from: pg0.n1$l$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForAutocapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForAutocapture createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4.SideIdPart sideIdPartCreateFromParcel = i4.SideIdPart.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                q qVar = (q) parcel.readParcelable(WaitForAutocapture.class.getClassLoader());
                g5.b.a aVarValueOf = g5.b.a.valueOf(parcel.readString());
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                return new WaitForAutocapture(sideIdPartCreateFromParcel, arrayList, qVar, aVarValueOf, arrayList2, parcel.readInt(), (n1) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), parcel.readInt() == 0 ? null : xg0.v.valueOf(parcel.readString()), parcel.readString(), (Throwable) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (vg0.d) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), null, 16384, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForAutocapture[] newArray(int i11) {
                return new WaitForAutocapture[i11];
            }
        }

        public /* synthetic */ WaitForAutocapture(i4.SideIdPart sideIdPart, List list, q qVar, g5.b.a aVar, List list2, int i11, n1 n1Var, xg0.v vVar, String str, Throwable th2, boolean z11, boolean z12, String str2, vg0.d dVar, wn0.a aVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, qVar, aVar, list2, i11, n1Var, vVar, str, (i12 & 512) != 0 ? null : th2, (i12 & 1024) != 0 ? true : z11, (i12 & 2048) != 0 ? true : z12, str2, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : dVar, (i12 & 16384) != 0 ? new wn0.a() { // from class: pg0.o1
                @Override // wn0.a
                public final Object invoke() {
                    return n1.WaitForAutocapture.q();
                }
            } : aVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 q() {
            return jn0.h0.f84049a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForAutocapture s(WaitForAutocapture waitForAutocapture, i4.SideIdPart sideIdPart, List list, q qVar, g5.b.a aVar, List list2, int i11, n1 n1Var, xg0.v vVar, String str, Throwable th2, boolean z11, boolean z12, String str2, vg0.d dVar, wn0.a aVar2, int i12, Object obj) {
            return waitForAutocapture.r((i12 & 1) != 0 ? waitForAutocapture.currentPart : sideIdPart, (i12 & 2) != 0 ? waitForAutocapture.uploadingIds : list, (i12 & 4) != 0 ? waitForAutocapture.captureConfig : qVar, (i12 & 8) != 0 ? waitForAutocapture.manualCapture : aVar, (i12 & 16) != 0 ? waitForAutocapture.parts : list2, (i12 & 32) != 0 ? waitForAutocapture.partIndex : i11, (i12 & 64) != 0 ? waitForAutocapture.backState : n1Var, (i12 & 128) != 0 ? waitForAutocapture.webRtcState : vVar, (i12 & 256) != 0 ? waitForAutocapture.webRtcJwt : str, (i12 & 512) != 0 ? waitForAutocapture.error : th2, (i12 & 1024) != 0 ? waitForAutocapture.checkCameraPermissions : z11, (i12 & 2048) != 0 ? waitForAutocapture.checkAudioPermissions : z12, (i12 & 4096) != 0 ? waitForAutocapture.countryCode : str2, (i12 & PKIFailureInfo.certRevoked) != 0 ? waitForAutocapture.hint : dVar, (i12 & 16384) != 0 ? waitForAutocapture.webRtcConnectionEstablished : aVar2);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final g5.b.a getManualCapture() {
            return this.manualCapture;
        }

        public final wn0.a<jn0.h0> D() {
            return this.webRtcConnectionEstablished;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final xg0.v getWebRtcState() {
            return this.webRtcState;
        }

        @Override // pg0.b
        public n1 a(boolean newValue) {
            return s(this, null, null, null, null, null, 0, null, null, null, null, false, newValue, null, null, null, 30719, null);
        }

        @Override // pg0.d
        public n1 b(boolean newValue) {
            return s(this, null, null, null, null, null, 0, null, null, null, null, newValue, false, null, null, null, 31743, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForAutocapture)) {
                return false;
            }
            WaitForAutocapture waitForAutocapture = (WaitForAutocapture) other;
            return p013kotlin.jvm.internal.s.f(this.currentPart, waitForAutocapture.currentPart) && p013kotlin.jvm.internal.s.f(this.uploadingIds, waitForAutocapture.uploadingIds) && p013kotlin.jvm.internal.s.f(this.captureConfig, waitForAutocapture.captureConfig) && this.manualCapture == waitForAutocapture.manualCapture && p013kotlin.jvm.internal.s.f(this.parts, waitForAutocapture.parts) && this.partIndex == waitForAutocapture.partIndex && p013kotlin.jvm.internal.s.f(this.backState, waitForAutocapture.backState) && this.webRtcState == waitForAutocapture.webRtcState && p013kotlin.jvm.internal.s.f(this.webRtcJwt, waitForAutocapture.webRtcJwt) && p013kotlin.jvm.internal.s.f(this.error, waitForAutocapture.error) && this.checkCameraPermissions == waitForAutocapture.checkCameraPermissions && this.checkAudioPermissions == waitForAutocapture.checkAudioPermissions && p013kotlin.jvm.internal.s.f(this.countryCode, waitForAutocapture.countryCode) && p013kotlin.jvm.internal.s.f(this.hint, waitForAutocapture.hint) && p013kotlin.jvm.internal.s.f(this.webRtcConnectionEstablished, waitForAutocapture.webRtcConnectionEstablished);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.manualCapture.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            n1 n1Var = this.backState;
            int iHashCode2 = (iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
            xg0.v vVar = this.webRtcState;
            int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
            String str = this.webRtcJwt;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th2 = this.error;
            int iHashCode5 = (((((iHashCode4 + (th2 == null ? 0 : th2.hashCode())) * 31) + Boolean.hashCode(this.checkCameraPermissions)) * 31) + Boolean.hashCode(this.checkAudioPermissions)) * 31;
            String str2 = this.countryCode;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            vg0.d dVar = this.hint;
            return ((iHashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.webRtcConnectionEstablished.hashCode();
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        public final WaitForAutocapture r(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, q captureConfig, g5.b.a manualCapture, List<? extends i4> parts, int partIndex, n1 backState, xg0.v webRtcState, String webRtcJwt, Throwable error, boolean checkCameraPermissions, boolean checkAudioPermissions, String countryCode, vg0.d hint, wn0.a<jn0.h0> webRtcConnectionEstablished) {
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            p013kotlin.jvm.internal.s.k(manualCapture, "manualCapture");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(webRtcConnectionEstablished, "webRtcConnectionEstablished");
            return new WaitForAutocapture(currentPart, uploadingIds, captureConfig, manualCapture, parts, partIndex, backState, webRtcState, webRtcJwt, error, checkCameraPermissions, checkAudioPermissions, countryCode, hint, webRtcConnectionEstablished);
        }

        public String toString() {
            return "WaitForAutocapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", manualCapture=" + this.manualCapture + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", webRtcState=" + this.webRtcState + ", webRtcJwt=" + this.webRtcJwt + ", error=" + this.error + ", checkCameraPermissions=" + this.checkCameraPermissions + ", checkAudioPermissions=" + this.checkAudioPermissions + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ", webRtcConnectionEstablished=" + this.webRtcConnectionEstablished + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final q getCaptureConfig() {
            return this.captureConfig;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public boolean getCheckAudioPermissions() {
            return this.checkAudioPermissions;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public boolean getCheckCameraPermissions() {
            return this.checkCameraPermissions;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeString(this.manualCapture.name());
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            xg0.v vVar = this.webRtcState;
            if (vVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(vVar.name());
            }
            dest.writeString(this.webRtcJwt);
            dest.writeSerializable(this.error);
            dest.writeInt(this.checkCameraPermissions ? 1 : 0);
            dest.writeInt(this.checkAudioPermissions ? 1 : 0);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.hint, flags);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: x, reason: from getter */
        public i4.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final vg0.d getHint() {
            return this.hint;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WaitForAutocapture(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, q captureConfig, g5.b.a manualCapture, List<? extends i4> parts, int i11, n1 n1Var, xg0.v vVar, String str, Throwable th2, boolean z11, boolean z12, String str2, vg0.d dVar, wn0.a<jn0.h0> webRtcConnectionEstablished) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            p013kotlin.jvm.internal.s.k(manualCapture, "manualCapture");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(webRtcConnectionEstablished, "webRtcConnectionEstablished");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.manualCapture = manualCapture;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.webRtcState = vVar;
            this.webRtcJwt = str;
            this.error = th2;
            this.checkCameraPermissions = z11;
            this.checkAudioPermissions = z12;
            this.countryCode = str2;
            this.hint = dVar;
            this.webRtcConnectionEstablished = webRtcConnectionEstablished;
        }
    }

    private n1() {
    }

    /* JADX INFO: renamed from: pg0.n1$a, reason: from toString */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010!J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b4\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b7\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\bA\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\bB\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u0010#R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b=\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lpg0/n1$a;", "Lpg0/n1;", "Lpg0/i4$a;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "Lpg0/i4;", "parts", "", "partIndex", "backState", "", "countryCode", "Lpg0/c0;", "captureFrames", "Lzf0/u;", "cameraProperties", "Lpg0/f4;", "idConfigsForCountry", "selectedCountryCode", "selectedIdClass", "Lpg0/c;", "errorType", "<init>", "(Lpg0/i4$a;Ljava/util/List;Ljava/util/List;ILpg0/n1;Ljava/lang/String;Ljava/util/List;Lzf0/u;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lpg0/c;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/i4$a;", "q", "()Lpg0/i4$a;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "j", "e", "I", IntegerTokenConverter.CONVERTER_KEY, "f", "Lpg0/n1;", "()Lpg0/n1;", "g", "Ljava/lang/String;", "h", "m", "Lzf0/u;", "getCameraProperties", "()Lzf0/u;", "s", "getSelectedCountryCode", "l", "getSelectedIdClass", "Lpg0/c;", "r", "()Lpg0/c;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AutoClassificationError extends n1 {
        public static final Parcelable.Creator<AutoClassificationError> CREATOR = new C2180a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Frame> captureFrames;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final zf0.u cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<IdConfigForCountry> idConfigsForCountry;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedCountryCode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedIdClass;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final c errorType;

        /* JADX INFO: renamed from: pg0.n1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2180a implements Parcelable.Creator<AutoClassificationError> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationError createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4.SideIdPart sideIdPartCreateFromParcel = i4.SideIdPart.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(AutoClassificationError.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(AutoClassificationError.class.getClassLoader()));
                }
                int i15 = parcel.readInt();
                n1 n1Var = (n1) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                String string = parcel.readString();
                int i16 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                zf0.u uVar = (zf0.u) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                int i18 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationError(sideIdPartCreateFromParcel, arrayList, arrayList2, i15, n1Var, string, arrayList3, uVar, arrayList4, parcel.readString(), parcel.readString(), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationError[] newArray(int i11) {
                return new AutoClassificationError[i11];
            }
        }

        public /* synthetic */ AutoClassificationError(i4.SideIdPart sideIdPart, List list, List list2, int i11, n1 n1Var, String str, List list3, zf0.u uVar, List list4, String str2, String str3, c cVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? new i4.SideIdPart(IdConfig.e.Front) : sideIdPart, (i12 & 2) != 0 ? p013kotlin.collections.v.m() : list, list2, i11, n1Var, str, list3, uVar, list4, (i12 & 512) != 0 ? null : str2, (i12 & 1024) != 0 ? null : str3, cVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClassificationError)) {
                return false;
            }
            AutoClassificationError autoClassificationError = (AutoClassificationError) other;
            return p013kotlin.jvm.internal.s.f(this.currentPart, autoClassificationError.currentPart) && p013kotlin.jvm.internal.s.f(this.uploadingIds, autoClassificationError.uploadingIds) && p013kotlin.jvm.internal.s.f(this.parts, autoClassificationError.parts) && this.partIndex == autoClassificationError.partIndex && p013kotlin.jvm.internal.s.f(this.backState, autoClassificationError.backState) && p013kotlin.jvm.internal.s.f(this.countryCode, autoClassificationError.countryCode) && p013kotlin.jvm.internal.s.f(this.captureFrames, autoClassificationError.captureFrames) && p013kotlin.jvm.internal.s.f(this.cameraProperties, autoClassificationError.cameraProperties) && p013kotlin.jvm.internal.s.f(this.idConfigsForCountry, autoClassificationError.idConfigsForCountry) && p013kotlin.jvm.internal.s.f(this.selectedCountryCode, autoClassificationError.selectedCountryCode) && p013kotlin.jvm.internal.s.f(this.selectedIdClass, autoClassificationError.selectedIdClass) && this.errorType == autoClassificationError.errorType;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            n1 n1Var = this.backState;
            int iHashCode2 = (iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.captureFrames.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + this.idConfigsForCountry.hashCode()) * 31;
            String str2 = this.selectedCountryCode;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedIdClass;
            return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.errorType.hashCode();
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        public final List<Frame> m() {
            return this.captureFrames;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: q, reason: from getter */
        public i4.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final c getErrorType() {
            return this.errorType;
        }

        public final List<IdConfigForCountry> s() {
            return this.idConfigsForCountry;
        }

        public String toString() {
            return "AutoClassificationError(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ", errorType=" + this.errorType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            List<Frame> list3 = this.captureFrames;
            dest.writeInt(list3.size());
            Iterator<Frame> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<IdConfigForCountry> list4 = this.idConfigsForCountry;
            dest.writeInt(list4.size());
            Iterator<IdConfigForCountry> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.selectedCountryCode);
            dest.writeString(this.selectedIdClass);
            dest.writeString(this.errorType.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationError(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, List<? extends i4> parts, int i11, n1 n1Var, String str, List<Frame> captureFrames, zf0.u cameraProperties, List<IdConfigForCountry> idConfigsForCountry, String str2, String str3, c errorType) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(captureFrames, "captureFrames");
            p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
            p013kotlin.jvm.internal.s.k(idConfigsForCountry, "idConfigsForCountry");
            p013kotlin.jvm.internal.s.k(errorType, "errorType");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i11;
            this.backState = n1Var;
            this.countryCode = str;
            this.captureFrames = captureFrames;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = idConfigsForCountry;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
            this.errorType = errorType;
        }
    }

    /* JADX INFO: renamed from: pg0.n1$c, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ|\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\b0\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00104\u001a\u0004\b?\u0010 ¨\u0006@"}, d2 = {"Lpg0/n1$c;", "Lpg0/n1;", "Lpg0/i4$a;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "Lpg0/i4;", "parts", "", "partIndex", "", "countryCode", "Lpg0/q;", "captureConfig", "", "choosingDocumentToUpload", "backState", AnalyticsAttribute.Error, "<init>", "(Lpg0/i4$a;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lpg0/q;ZLpg0/n1;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "m", "(Lpg0/i4$a;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lpg0/q;ZLpg0/n1;Ljava/lang/String;)Lpg0/n1$c;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/i4$a;", "u", "()Lpg0/i4$a;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "j", "e", "I", IntegerTokenConverter.CONVERTER_KEY, "f", "Ljava/lang/String;", "g", "Lpg0/q;", "r", "()Lpg0/q;", "h", "Z", "s", "()Z", "Lpg0/n1;", "()Lpg0/n1;", "v", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChooseCaptureMethod extends n1 {
        public static final Parcelable.Creator<ChooseCaptureMethod> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final q captureConfig;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean choosingDocumentToUpload;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        /* JADX INFO: renamed from: pg0.n1$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChooseCaptureMethod> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChooseCaptureMethod createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4.SideIdPart sideIdPartCreateFromParcel = i4.SideIdPart.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()));
                }
                return new ChooseCaptureMethod(sideIdPartCreateFromParcel, arrayList, arrayList2, parcel.readInt(), parcel.readString(), (q) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readInt() != 0, (n1) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChooseCaptureMethod[] newArray(int i11) {
                return new ChooseCaptureMethod[i11];
            }
        }

        public /* synthetic */ ChooseCaptureMethod(i4.SideIdPart sideIdPart, List list, List list2, int i11, String str, q qVar, boolean z11, n1 n1Var, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? new i4.SideIdPart(IdConfig.e.Front) : sideIdPart, (i12 & 2) != 0 ? p013kotlin.collections.v.m() : list, list2, i11, str, qVar, (i12 & 64) != 0 ? false : z11, n1Var, (i12 & 256) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChooseCaptureMethod q(ChooseCaptureMethod chooseCaptureMethod, i4.SideIdPart sideIdPart, List list, List list2, int i11, String str, q qVar, boolean z11, n1 n1Var, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                sideIdPart = chooseCaptureMethod.currentPart;
            }
            if ((i12 & 2) != 0) {
                list = chooseCaptureMethod.uploadingIds;
            }
            if ((i12 & 4) != 0) {
                list2 = chooseCaptureMethod.parts;
            }
            if ((i12 & 8) != 0) {
                i11 = chooseCaptureMethod.partIndex;
            }
            if ((i12 & 16) != 0) {
                str = chooseCaptureMethod.countryCode;
            }
            if ((i12 & 32) != 0) {
                qVar = chooseCaptureMethod.captureConfig;
            }
            if ((i12 & 64) != 0) {
                z11 = chooseCaptureMethod.choosingDocumentToUpload;
            }
            if ((i12 & 128) != 0) {
                n1Var = chooseCaptureMethod.backState;
            }
            if ((i12 & 256) != 0) {
                str2 = chooseCaptureMethod.error;
            }
            n1 n1Var2 = n1Var;
            String str3 = str2;
            q qVar2 = qVar;
            boolean z12 = z11;
            String str4 = str;
            List list3 = list2;
            return chooseCaptureMethod.m(sideIdPart, list, list3, i11, str4, qVar2, z12, n1Var2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChooseCaptureMethod)) {
                return false;
            }
            ChooseCaptureMethod chooseCaptureMethod = (ChooseCaptureMethod) other;
            return p013kotlin.jvm.internal.s.f(this.currentPart, chooseCaptureMethod.currentPart) && p013kotlin.jvm.internal.s.f(this.uploadingIds, chooseCaptureMethod.uploadingIds) && p013kotlin.jvm.internal.s.f(this.parts, chooseCaptureMethod.parts) && this.partIndex == chooseCaptureMethod.partIndex && p013kotlin.jvm.internal.s.f(this.countryCode, chooseCaptureMethod.countryCode) && p013kotlin.jvm.internal.s.f(this.captureConfig, chooseCaptureMethod.captureConfig) && this.choosingDocumentToUpload == chooseCaptureMethod.choosingDocumentToUpload && p013kotlin.jvm.internal.s.f(this.backState, chooseCaptureMethod.backState) && p013kotlin.jvm.internal.s.f(this.error, chooseCaptureMethod.error);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            String str = this.countryCode;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureConfig.hashCode()) * 31) + Boolean.hashCode(this.choosingDocumentToUpload)) * 31;
            n1 n1Var = this.backState;
            int iHashCode3 = (iHashCode2 + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        public final ChooseCaptureMethod m(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, List<? extends i4> parts, int partIndex, String countryCode, q captureConfig, boolean choosingDocumentToUpload, n1 backState, String error) {
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            return new ChooseCaptureMethod(currentPart, uploadingIds, parts, partIndex, countryCode, captureConfig, choosingDocumentToUpload, backState, error);
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final q getCaptureConfig() {
            return this.captureConfig;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getChoosingDocumentToUpload() {
            return this.choosingDocumentToUpload;
        }

        public String toString() {
            return "ChooseCaptureMethod(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", captureConfig=" + this.captureConfig + ", choosingDocumentToUpload=" + this.choosingDocumentToUpload + ", backState=" + this.backState + ", error=" + this.error + ")";
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: u, reason: from getter */
        public i4.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeInt(this.choosingDocumentToUpload ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.error);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChooseCaptureMethod(i4.SideIdPart currentPart, List<? extends d0> uploadingIds, List<? extends i4> parts, int i11, String str, q captureConfig, boolean z11, n1 n1Var, String str2) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            p013kotlin.jvm.internal.s.k(captureConfig, "captureConfig");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i11;
            this.countryCode = str;
            this.captureConfig = captureConfig;
            this.choosingDocumentToUpload = z11;
            this.backState = n1Var;
            this.error = str2;
        }
    }

    /* JADX INFO: renamed from: pg0.n1$j, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b9\u0010\u001d¨\u0006:"}, d2 = {"Lpg0/n1$j;", "Lpg0/n1;", "Lpg0/i4;", "currentPart", "", "Lpg0/d0;", "uploadingIds", "parts", "backState", "", "partIndex", "", "countryCode", "Lpg0/d4;", "selectedId", AnalyticsAttribute.Error, "<init>", "(Lpg0/i4;Ljava/util/List;Ljava/util/List;Lpg0/n1;ILjava/lang/String;Lpg0/d4;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "m", "(Lpg0/i4;Ljava/util/List;Ljava/util/List;Lpg0/n1;ILjava/lang/String;Lpg0/d4;Ljava/lang/String;)Lpg0/n1$j;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lpg0/i4;", "g", "()Lpg0/i4;", "c", "Ljava/util/List;", "k", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "j", "e", "Lpg0/n1;", "()Lpg0/n1;", "f", "I", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "h", "Lpg0/d4;", "getSelectedId", "()Lpg0/d4;", "r", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowInstructions extends n1 {
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4 currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<i4> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final n1 backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdConfig selectedId;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        /* JADX INFO: renamed from: pg0.n1$j$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowInstructions> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                i4 i4Var = (i4) parcel.readParcelable(ShowInstructions.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(ShowInstructions.class.getClassLoader()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(ShowInstructions.class.getClassLoader()));
                }
                return new ShowInstructions(i4Var, arrayList, arrayList2, (n1) parcel.readParcelable(ShowInstructions.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions[] newArray(int i11) {
                return new ShowInstructions[i11];
            }
        }

        public /* synthetic */ ShowInstructions(i4 i4Var, List list, List list2, n1 n1Var, int i11, String str, IdConfig idConfig, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? new i4.SideIdPart(IdConfig.e.Front) : i4Var, (i12 & 2) != 0 ? p013kotlin.collections.v.m() : list, (i12 & 4) != 0 ? p013kotlin.collections.v.m() : list2, (i12 & 8) != 0 ? null : n1Var, (i12 & 16) != 0 ? -1 : i11, str, (i12 & 64) != 0 ? null : idConfig, (i12 & 128) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowInstructions q(ShowInstructions showInstructions, i4 i4Var, List list, List list2, n1 n1Var, int i11, String str, IdConfig idConfig, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i4Var = showInstructions.currentPart;
            }
            if ((i12 & 2) != 0) {
                list = showInstructions.uploadingIds;
            }
            if ((i12 & 4) != 0) {
                list2 = showInstructions.parts;
            }
            if ((i12 & 8) != 0) {
                n1Var = showInstructions.backState;
            }
            if ((i12 & 16) != 0) {
                i11 = showInstructions.partIndex;
            }
            if ((i12 & 32) != 0) {
                str = showInstructions.countryCode;
            }
            if ((i12 & 64) != 0) {
                idConfig = showInstructions.selectedId;
            }
            if ((i12 & 128) != 0) {
                str2 = showInstructions.error;
            }
            IdConfig idConfig2 = idConfig;
            String str3 = str2;
            int i13 = i11;
            String str4 = str;
            return showInstructions.m(i4Var, list, list2, n1Var, i13, str4, idConfig2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: e, reason: from getter */
        public n1 getBackState() {
            return this.backState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowInstructions)) {
                return false;
            }
            ShowInstructions showInstructions = (ShowInstructions) other;
            return p013kotlin.jvm.internal.s.f(this.currentPart, showInstructions.currentPart) && p013kotlin.jvm.internal.s.f(this.uploadingIds, showInstructions.uploadingIds) && p013kotlin.jvm.internal.s.f(this.parts, showInstructions.parts) && p013kotlin.jvm.internal.s.f(this.backState, showInstructions.backState) && this.partIndex == showInstructions.partIndex && p013kotlin.jvm.internal.s.f(this.countryCode, showInstructions.countryCode) && p013kotlin.jvm.internal.s.f(this.selectedId, showInstructions.selectedId) && p013kotlin.jvm.internal.s.f(this.error, showInstructions.error);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: g, reason: from getter */
        public i4 getCurrentPart() {
            return this.currentPart;
        }

        public int hashCode() {
            int iHashCode = ((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31;
            n1 n1Var = this.backState;
            int iHashCode2 = (((iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31) + Integer.hashCode(this.partIndex)) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            IdConfig idConfig = this.selectedId;
            int iHashCode4 = (iHashCode3 + (idConfig == null ? 0 : idConfig.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // pg0.n1
        /* JADX INFO: renamed from: i, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // pg0.n1
        public List<i4> j() {
            return this.parts;
        }

        @Override // pg0.n1
        public List<d0> k() {
            return this.uploadingIds;
        }

        public final ShowInstructions m(i4 currentPart, List<? extends d0> uploadingIds, List<? extends i4> parts, n1 backState, int partIndex, String countryCode, IdConfig selectedId, String error) {
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            return new ShowInstructions(currentPart, uploadingIds, parts, backState, partIndex, countryCode, selectedId, error);
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public String toString() {
            return "ShowInstructions(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", backState=" + this.backState + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", selectedId=" + this.selectedId + ", error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<d0> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<d0> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i4> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i4> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeParcelable(this.backState, flags);
            dest.writeInt(this.partIndex);
            dest.writeString(this.countryCode);
            IdConfig idConfig = this.selectedId;
            if (idConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                idConfig.writeToParcel(dest, flags);
            }
            dest.writeString(this.error);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowInstructions(i4 currentPart, List<? extends d0> uploadingIds, List<? extends i4> parts, n1 n1Var, int i11, String str, IdConfig idConfig, String str2) {
            super(null);
            p013kotlin.jvm.internal.s.k(currentPart, "currentPart");
            p013kotlin.jvm.internal.s.k(uploadingIds, "uploadingIds");
            p013kotlin.jvm.internal.s.k(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.backState = n1Var;
            this.partIndex = i11;
            this.countryCode = str;
            this.selectedId = idConfig;
            this.error = str2;
        }
    }
}
