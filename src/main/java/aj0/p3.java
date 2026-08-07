package aj0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oi0.n5;
import oi0.t5;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Laj0/p3;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "Laj0/p3$a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class p3 implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Laj0/p3$b;", "Landroid/os/Parcelable;", "a", "b", "Laj0/p3$b$a;", "Laj0/p3$b$b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b extends Parcelable {

        /* JADX INFO: renamed from: aj0.p3$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Laj0/p3$b$a;", "Laj0/p3$b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "createPersonaSheetComponent", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CreateReusablePersona implements b {
            public static final Parcelable.Creator<CreateReusablePersona> CREATOR = new C0053a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CreatePersonaSheetComponent createPersonaSheetComponent;

            /* JADX INFO: renamed from: aj0.p3$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C0053a implements Parcelable.Creator<CreateReusablePersona> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CreateReusablePersona createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new CreateReusablePersona((CreatePersonaSheetComponent) parcel.readParcelable(CreateReusablePersona.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CreateReusablePersona[] newArray(int i11) {
                    return new CreateReusablePersona[i11];
                }
            }

            public CreateReusablePersona(CreatePersonaSheetComponent createPersonaSheetComponent) {
                p013kotlin.jvm.internal.s.k(createPersonaSheetComponent, "createPersonaSheetComponent");
                this.createPersonaSheetComponent = createPersonaSheetComponent;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CreatePersonaSheetComponent getCreatePersonaSheetComponent() {
                return this.createPersonaSheetComponent;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreateReusablePersona) && p013kotlin.jvm.internal.s.f(this.createPersonaSheetComponent, ((CreateReusablePersona) other).createPersonaSheetComponent);
            }

            public int hashCode() {
                return this.createPersonaSheetComponent.hashCode();
            }

            public String toString() {
                return "CreateReusablePersona(createPersonaSheetComponent=" + this.createPersonaSheetComponent + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeParcelable(this.createPersonaSheetComponent, flags);
            }
        }

        /* JADX INFO: renamed from: aj0.p3$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Laj0/p3$b$b;", "Laj0/p3$b;", "Loi0/t5;", "verifyPersonaButtonComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Loi0/t5;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loi0/t5;", "b", "()Loi0/t5;", "Ljava/util/Map;", "()Ljava/util/Map;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VerifyReusablePersona implements b {
            public static final Parcelable.Creator<VerifyReusablePersona> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final t5 verifyPersonaButtonComponent;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Map<String, ComponentParam> componentParams;

            /* JADX INFO: renamed from: aj0.p3$b$b$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<VerifyReusablePersona> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final VerifyReusablePersona createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    t5 t5Var = (t5) parcel.readParcelable(VerifyReusablePersona.class.getClassLoader());
                    int i11 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(VerifyReusablePersona.class.getClassLoader()));
                    }
                    return new VerifyReusablePersona(t5Var, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final VerifyReusablePersona[] newArray(int i11) {
                    return new VerifyReusablePersona[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public VerifyReusablePersona(t5 verifyPersonaButtonComponent, Map<String, ? extends ComponentParam> componentParams) {
                p013kotlin.jvm.internal.s.k(verifyPersonaButtonComponent, "verifyPersonaButtonComponent");
                p013kotlin.jvm.internal.s.k(componentParams, "componentParams");
                this.verifyPersonaButtonComponent = verifyPersonaButtonComponent;
                this.componentParams = componentParams;
            }

            public final Map<String, ComponentParam> a() {
                return this.componentParams;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final t5 getVerifyPersonaButtonComponent() {
                return this.verifyPersonaButtonComponent;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VerifyReusablePersona)) {
                    return false;
                }
                VerifyReusablePersona verifyReusablePersona = (VerifyReusablePersona) other;
                return p013kotlin.jvm.internal.s.f(this.verifyPersonaButtonComponent, verifyReusablePersona.verifyPersonaButtonComponent) && p013kotlin.jvm.internal.s.f(this.componentParams, verifyReusablePersona.componentParams);
            }

            public int hashCode() {
                return (this.verifyPersonaButtonComponent.hashCode() * 31) + this.componentParams.hashCode();
            }

            public String toString() {
                return "VerifyReusablePersona(verifyPersonaButtonComponent=" + this.verifyPersonaButtonComponent + ", componentParams=" + this.componentParams + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeParcelable(this.verifyPersonaButtonComponent, flags);
                Map<String, ComponentParam> map = this.componentParams;
                dest.writeInt(map.size());
                for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
        }
    }

    public /* synthetic */ p3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private p3() {
    }

    /* JADX INFO: renamed from: aj0.p3$a, reason: from toString */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001:\u00024%B©\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J¸\u0001\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b)\u0010$J\u001a\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b4\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\b>\u0010ER\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\bG\u0010ER%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b3\u0010H\u001a\u0004\b9\u0010IR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bF\u0010(¨\u0006M"}, d2 = {"Laj0/p3$a;", "Laj0/p3;", "", "Loi0/n5;", "components", "", "stepName", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", AnalyticsAttribute.Error, "Laj0/p3$a$c;", "nfcScan", "Laj0/p3$a$a;", "autoSubmit", "Laj0/p3$b;", "pendingAction", "", "hasRequestedGpsPermissions", "isRequestingGpsPermissions", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "triggeringComponent", "requestPermissionKey", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Laj0/p3$a$c;Laj0/p3$a$a;Laj0/p3$b;ZZLjava/util/Map;Loi0/n5;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Laj0/p3$a$c;Laj0/p3$a$a;Laj0/p3$b;ZZLjava/util/Map;Loi0/n5;Ljava/lang/String;)Laj0/p3$a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "b", "Ljava/lang/String;", "k", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "e", "f", "Laj0/p3$a$c;", "h", "()Laj0/p3$a$c;", "g", "Laj0/p3$a$a;", "()Laj0/p3$a$a;", "Laj0/p3$b;", IntegerTokenConverter.CONVERTER_KEY, "()Laj0/p3$b;", "Z", "()Z", "j", "m", "Ljava/util/Map;", "()Ljava/util/Map;", "l", "Loi0/n5;", "()Loi0/n5;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Displaying extends p3 {
        public static final Parcelable.Creator<Displaying> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<n5> components;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<UiComponentError> componentErrors;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.UiStepStyle styles;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final NfcScan nfcScan;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final AutoSubmit autoSubmit;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final b pendingAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasRequestedGpsPermissions;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequestingGpsPermissions;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, ComponentParam> componentParams;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final n5 triggeringComponent;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestPermissionKey;

        /* JADX INFO: renamed from: aj0.p3$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0013¨\u0006!"}, d2 = {"Laj0/p3$a$a;", "Landroid/os/Parcelable;", "Loi0/h;", "component", "", "countdown", "", "countdownText", "<init>", "(Loi0/h;ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loi0/h;", "()Loi0/h;", "b", "I", "c", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AutoSubmit implements Parcelable {
            public static final Parcelable.Creator<AutoSubmit> CREATOR = new C0051a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final oi0.h component;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int countdown;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String countdownText;

            /* JADX INFO: renamed from: aj0.p3$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C0051a implements Parcelable.Creator<AutoSubmit> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AutoSubmit createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new AutoSubmit((oi0.h) parcel.readParcelable(AutoSubmit.class.getClassLoader()), parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final AutoSubmit[] newArray(int i11) {
                    return new AutoSubmit[i11];
                }
            }

            public AutoSubmit(oi0.h component, int i11, String str) {
                p013kotlin.jvm.internal.s.k(component, "component");
                this.component = component;
                this.countdown = i11;
                this.countdownText = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final oi0.h getComponent() {
                return this.component;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getCountdown() {
                return this.countdown;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getCountdownText() {
                return this.countdownText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoSubmit)) {
                    return false;
                }
                AutoSubmit autoSubmit = (AutoSubmit) other;
                return p013kotlin.jvm.internal.s.f(this.component, autoSubmit.component) && this.countdown == autoSubmit.countdown && p013kotlin.jvm.internal.s.f(this.countdownText, autoSubmit.countdownText);
            }

            public int hashCode() {
                int iHashCode = ((this.component.hashCode() * 31) + Integer.hashCode(this.countdown)) * 31;
                String str = this.countdownText;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "AutoSubmit(component=" + this.component + ", countdown=" + this.countdown + ", countdownText=" + this.countdownText + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeParcelable(this.component, flags);
                dest.writeInt(this.countdown);
                dest.writeString(this.countdownText);
            }
        }

        /* JADX INFO: renamed from: aj0.p3$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Displaying> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Displaying createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                int i12 = 0;
                for (int i13 = 0; i13 != i11; i13++) {
                    arrayList.add(parcel.readParcelable(Displaying.class.getClassLoader()));
                }
                String string = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(parcel.readParcelable(Displaying.class.getClassLoader()));
                }
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(Displaying.class.getClassLoader());
                String string2 = parcel.readString();
                NfcScan nfcScanCreateFromParcel = parcel.readInt() == 0 ? null : NfcScan.CREATOR.createFromParcel(parcel);
                AutoSubmit autoSubmitCreateFromParcel = parcel.readInt() == 0 ? null : AutoSubmit.CREATOR.createFromParcel(parcel);
                b bVar = (b) parcel.readParcelable(Displaying.class.getClassLoader());
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i16 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i16);
                    while (i12 != i16) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(Displaying.class.getClassLoader()));
                        i12++;
                        uiStepStyle = uiStepStyle;
                    }
                }
                return new Displaying(arrayList, string, arrayList2, uiStepStyle, string2, nfcScanCreateFromParcel, autoSubmitCreateFromParcel, bVar, z11, z12, linkedHashMap, (n5) parcel.readParcelable(Displaying.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Displaying[] newArray(int i11) {
                return new Displaying[i11];
            }
        }

        /* JADX INFO: renamed from: aj0.p3$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Laj0/p3$a$c;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NfcScan implements Parcelable {
            public static final Parcelable.Creator<NfcScan> CREATOR = new C0052a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final GovernmentIdNfcScanComponent component;

            /* JADX INFO: renamed from: aj0.p3$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C0052a implements Parcelable.Creator<NfcScan> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final NfcScan createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new NfcScan((GovernmentIdNfcScanComponent) parcel.readParcelable(NfcScan.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final NfcScan[] newArray(int i11) {
                    return new NfcScan[i11];
                }
            }

            public NfcScan(GovernmentIdNfcScanComponent component) {
                p013kotlin.jvm.internal.s.k(component, "component");
                this.component = component;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final GovernmentIdNfcScanComponent getComponent() {
                return this.component;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NfcScan) && p013kotlin.jvm.internal.s.f(this.component, ((NfcScan) other).component);
            }

            public int hashCode() {
                return this.component.hashCode();
            }

            public String toString() {
                return "NfcScan(component=" + this.component + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeParcelable(this.component, flags);
            }
        }

        public /* synthetic */ Displaying(List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, AutoSubmit autoSubmit, b bVar, boolean z11, boolean z12, Map map, n5 n5Var, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i11 & 4) != 0 ? p013kotlin.collections.v.m() : list2, uiStepStyle, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : nfcScan, (i11 & 64) != 0 ? null : autoSubmit, (i11 & 128) != 0 ? null : bVar, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? false : z12, (i11 & 1024) != 0 ? null : map, (i11 & 2048) != 0 ? null : n5Var, (i11 & 4096) != 0 ? WebrtcBuildVersion.maint_version : str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Displaying b(Displaying displaying, List list, String str, List list2, StepStyles.UiStepStyle uiStepStyle, String str2, NfcScan nfcScan, AutoSubmit autoSubmit, b bVar, boolean z11, boolean z12, Map map, n5 n5Var, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = displaying.components;
            }
            return displaying.a(list, (i11 & 2) != 0 ? displaying.stepName : str, (i11 & 4) != 0 ? displaying.componentErrors : list2, (i11 & 8) != 0 ? displaying.styles : uiStepStyle, (i11 & 16) != 0 ? displaying.error : str2, (i11 & 32) != 0 ? displaying.nfcScan : nfcScan, (i11 & 64) != 0 ? displaying.autoSubmit : autoSubmit, (i11 & 128) != 0 ? displaying.pendingAction : bVar, (i11 & 256) != 0 ? displaying.hasRequestedGpsPermissions : z11, (i11 & 512) != 0 ? displaying.isRequestingGpsPermissions : z12, (i11 & 1024) != 0 ? displaying.componentParams : map, (i11 & 2048) != 0 ? displaying.triggeringComponent : n5Var, (i11 & 4096) != 0 ? displaying.requestPermissionKey : str3);
        }

        public final Displaying a(List<? extends n5> components, String stepName, List<? extends UiComponentError> componentErrors, StepStyles.UiStepStyle styles, String error, NfcScan nfcScan, AutoSubmit autoSubmit, b pendingAction, boolean hasRequestedGpsPermissions, boolean isRequestingGpsPermissions, Map<String, ? extends ComponentParam> componentParams, n5 triggeringComponent, String requestPermissionKey) {
            p013kotlin.jvm.internal.s.k(components, "components");
            p013kotlin.jvm.internal.s.k(stepName, "stepName");
            p013kotlin.jvm.internal.s.k(componentErrors, "componentErrors");
            p013kotlin.jvm.internal.s.k(requestPermissionKey, "requestPermissionKey");
            return new Displaying(components, stepName, componentErrors, styles, error, nfcScan, autoSubmit, pendingAction, hasRequestedGpsPermissions, isRequestingGpsPermissions, componentParams, triggeringComponent, requestPermissionKey);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AutoSubmit getAutoSubmit() {
            return this.autoSubmit;
        }

        public final List<UiComponentError> d() {
            return this.componentErrors;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Map<String, ComponentParam> e() {
            return this.componentParams;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return p013kotlin.jvm.internal.s.f(this.components, displaying.components) && p013kotlin.jvm.internal.s.f(this.stepName, displaying.stepName) && p013kotlin.jvm.internal.s.f(this.componentErrors, displaying.componentErrors) && p013kotlin.jvm.internal.s.f(this.styles, displaying.styles) && p013kotlin.jvm.internal.s.f(this.error, displaying.error) && p013kotlin.jvm.internal.s.f(this.nfcScan, displaying.nfcScan) && p013kotlin.jvm.internal.s.f(this.autoSubmit, displaying.autoSubmit) && p013kotlin.jvm.internal.s.f(this.pendingAction, displaying.pendingAction) && this.hasRequestedGpsPermissions == displaying.hasRequestedGpsPermissions && this.isRequestingGpsPermissions == displaying.isRequestingGpsPermissions && p013kotlin.jvm.internal.s.f(this.componentParams, displaying.componentParams) && p013kotlin.jvm.internal.s.f(this.triggeringComponent, displaying.triggeringComponent) && p013kotlin.jvm.internal.s.f(this.requestPermissionKey, displaying.requestPermissionKey);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getHasRequestedGpsPermissions() {
            return this.hasRequestedGpsPermissions;
        }

        public final List<n5> getComponents() {
            return this.components;
        }

        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final NfcScan getNfcScan() {
            return this.nfcScan;
        }

        public int hashCode() {
            int iHashCode = ((((this.components.hashCode() * 31) + this.stepName.hashCode()) * 31) + this.componentErrors.hashCode()) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode2 = (iHashCode + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            String str = this.error;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            NfcScan nfcScan = this.nfcScan;
            int iHashCode4 = (iHashCode3 + (nfcScan == null ? 0 : nfcScan.hashCode())) * 31;
            AutoSubmit autoSubmit = this.autoSubmit;
            int iHashCode5 = (iHashCode4 + (autoSubmit == null ? 0 : autoSubmit.hashCode())) * 31;
            b bVar = this.pendingAction;
            int iHashCode6 = (((((iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.hasRequestedGpsPermissions)) * 31) + Boolean.hashCode(this.isRequestingGpsPermissions)) * 31;
            Map<String, ComponentParam> map = this.componentParams;
            int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
            n5 n5Var = this.triggeringComponent;
            return ((iHashCode7 + (n5Var != null ? n5Var.hashCode() : 0)) * 31) + this.requestPermissionKey.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final b getPendingAction() {
            return this.pendingAction;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getRequestPermissionKey() {
            return this.requestPermissionKey;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final n5 getTriggeringComponent() {
            return this.triggeringComponent;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsRequestingGpsPermissions() {
            return this.isRequestingGpsPermissions;
        }

        public String toString() {
            return "Displaying(components=" + this.components + ", stepName=" + this.stepName + ", componentErrors=" + this.componentErrors + ", styles=" + this.styles + ", error=" + this.error + ", nfcScan=" + this.nfcScan + ", autoSubmit=" + this.autoSubmit + ", pendingAction=" + this.pendingAction + ", hasRequestedGpsPermissions=" + this.hasRequestedGpsPermissions + ", isRequestingGpsPermissions=" + this.isRequestingGpsPermissions + ", componentParams=" + this.componentParams + ", triggeringComponent=" + this.triggeringComponent + ", requestPermissionKey=" + this.requestPermissionKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            List<n5> list = this.components;
            dest.writeInt(list.size());
            Iterator<n5> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.stepName);
            List<UiComponentError> list2 = this.componentErrors;
            dest.writeInt(list2.size());
            Iterator<UiComponentError> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeParcelable(this.styles, flags);
            dest.writeString(this.error);
            NfcScan nfcScan = this.nfcScan;
            if (nfcScan == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                nfcScan.writeToParcel(dest, flags);
            }
            AutoSubmit autoSubmit = this.autoSubmit;
            if (autoSubmit == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                autoSubmit.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.pendingAction, flags);
            dest.writeInt(this.hasRequestedGpsPermissions ? 1 : 0);
            dest.writeInt(this.isRequestingGpsPermissions ? 1 : 0);
            Map<String, ComponentParam> map = this.componentParams;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
            dest.writeParcelable(this.triggeringComponent, flags);
            dest.writeString(this.requestPermissionKey);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Displaying(List<? extends n5> components, String stepName, List<? extends UiComponentError> componentErrors, StepStyles.UiStepStyle uiStepStyle, String str, NfcScan nfcScan, AutoSubmit autoSubmit, b bVar, boolean z11, boolean z12, Map<String, ? extends ComponentParam> map, n5 n5Var, String requestPermissionKey) {
            super(null);
            p013kotlin.jvm.internal.s.k(components, "components");
            p013kotlin.jvm.internal.s.k(stepName, "stepName");
            p013kotlin.jvm.internal.s.k(componentErrors, "componentErrors");
            p013kotlin.jvm.internal.s.k(requestPermissionKey, "requestPermissionKey");
            this.components = components;
            this.stepName = stepName;
            this.componentErrors = componentErrors;
            this.styles = uiStepStyle;
            this.error = str;
            this.nfcScan = nfcScan;
            this.autoSubmit = autoSubmit;
            this.pendingAction = bVar;
            this.hasRequestedGpsPermissions = z11;
            this.isRequestingGpsPermissions = z12;
            this.componentParams = map;
            this.triggeringComponent = n5Var;
            this.requestPermissionKey = requestPermissionKey;
        }
    }
}
