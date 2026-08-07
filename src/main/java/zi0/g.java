package zi0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u000b\b\f\rB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzi0/g;", "Ljava/io/Closeable;", "Landroid/os/Parcelable;", "<init>", "()V", "Ljn0/h0;", "close", "", "c", "()Ljava/lang/String;", "stepName", DateTokenConverter.CONVERTER_KEY, "b", "a", "Lzi0/g$a;", "Lzi0/g$b;", "Lzi0/g$c;", "Lzi0/g$d;", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class g implements Closeable, Parcelable {

    /* JADX INFO: renamed from: zi0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lzi0/g$a;", "Lzi0/g;", "Landroid/os/Parcelable;", "", "stepName", "", "Lzi0/c;", "documents", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljn0/h0;", "close", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "T", "()Ljava/util/List;", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DocumentStepData extends g implements Parcelable {
        public static final Parcelable.Creator<DocumentStepData> CREATOR = new C2790a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DocumentFile> documents;

        /* JADX INFO: renamed from: zi0.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2790a implements Parcelable.Creator<DocumentStepData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DocumentStepData createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                String string = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(DocumentFile.CREATOR.createFromParcel(parcel));
                }
                return new DocumentStepData(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DocumentStepData[] newArray(int i11) {
                return new DocumentStepData[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentStepData(String stepName, List<DocumentFile> documents) {
            super(null);
            s.k(stepName, "stepName");
            s.k(documents, "documents");
            this.stepName = stepName;
            this.documents = documents;
        }

        public final List<DocumentFile> T() {
            return this.documents;
        }

        @Override // zi0.g
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        @Override // zi0.g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<T> it = this.documents.iterator();
            while (it.hasNext()) {
                ((DocumentFile) it.next()).getData().delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentStepData)) {
                return false;
            }
            DocumentStepData documentStepData = (DocumentStepData) other;
            return s.f(this.stepName, documentStepData.stepName) && s.f(this.documents, documentStepData.documents);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.documents.hashCode();
        }

        public String toString() {
            return "DocumentStepData(stepName=" + this.stepName + ", documents=" + this.documents + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.stepName);
            List<DocumentFile> list = this.documents;
            dest.writeInt(list.size());
            Iterator<DocumentFile> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    /* JADX INFO: renamed from: zi0.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lzi0/g$b;", "Lzi0/g;", "", "stepName", "", "Lzi0/e;", "captures", "Lzi0/b;", "idDetails", "<init>", "(Ljava/lang/String;Ljava/util/List;Lzi0/b;)V", "Ljn0/h0;", "close", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "T", "()Ljava/util/List;", "Lzi0/b;", "getIdDetails", "()Lzi0/b;", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GovernmentIdStepData extends g {
        public static final Parcelable.Creator<GovernmentIdStepData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<GovernmentIdCapture> captures;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CollectedGovernmentIdDetails idDetails;

        /* JADX INFO: renamed from: zi0.g$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdStepData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepData createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                String string = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(GovernmentIdCapture.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdStepData(string, arrayList, CollectedGovernmentIdDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepData[] newArray(int i11) {
                return new GovernmentIdStepData[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GovernmentIdStepData(String stepName, List<GovernmentIdCapture> captures, CollectedGovernmentIdDetails idDetails) {
            super(null);
            s.k(stepName, "stepName");
            s.k(captures, "captures");
            s.k(idDetails, "idDetails");
            this.stepName = stepName;
            this.captures = captures;
            this.idDetails = idDetails;
        }

        public final List<GovernmentIdCapture> T() {
            return this.captures;
        }

        @Override // zi0.g
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        @Override // zi0.g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<T> it = this.captures.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((GovernmentIdCapture) it.next()).G3().iterator();
                while (it2.hasNext()) {
                    ((GovernmentIdCapture.Frame) it2.next()).getData().delete();
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdStepData)) {
                return false;
            }
            GovernmentIdStepData governmentIdStepData = (GovernmentIdStepData) other;
            return s.f(this.stepName, governmentIdStepData.stepName) && s.f(this.captures, governmentIdStepData.captures) && s.f(this.idDetails, governmentIdStepData.idDetails);
        }

        public int hashCode() {
            return (((this.stepName.hashCode() * 31) + this.captures.hashCode()) * 31) + this.idDetails.hashCode();
        }

        public String toString() {
            return "GovernmentIdStepData(stepName=" + this.stepName + ", captures=" + this.captures + ", idDetails=" + this.idDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.stepName);
            List<GovernmentIdCapture> list = this.captures;
            dest.writeInt(list.size());
            Iterator<GovernmentIdCapture> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            this.idDetails.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zi0.g$c, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lzi0/g$c;", "Lzi0/g;", "", "stepName", "Lzi0/f;", "centerCapture", "leftCapture", "rightCapture", "<init>", "(Ljava/lang/String;Lzi0/f;Lzi0/f;Lzi0/f;)V", "Ljn0/h0;", "close", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lzi0/f;", "T", "()Lzi0/f;", "b0", DateTokenConverter.CONVERTER_KEY, "c0", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelfieStepData extends g {
        public static final Parcelable.Creator<SelfieStepData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SelfieCapture centerCapture;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final SelfieCapture leftCapture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final SelfieCapture rightCapture;

        /* JADX INFO: renamed from: zi0.g$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieStepData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieStepData createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new SelfieStepData(parcel.readString(), parcel.readInt() == 0 ? null : SelfieCapture.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieCapture.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SelfieCapture.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieStepData[] newArray(int i11) {
                return new SelfieStepData[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieStepData(String stepName, SelfieCapture selfieCapture, SelfieCapture selfieCapture2, SelfieCapture selfieCapture3) {
            super(null);
            s.k(stepName, "stepName");
            this.stepName = stepName;
            this.centerCapture = selfieCapture;
            this.leftCapture = selfieCapture2;
            this.rightCapture = selfieCapture3;
        }

        /* JADX INFO: renamed from: T, reason: from getter */
        public final SelfieCapture getCenterCapture() {
            return this.centerCapture;
        }

        /* JADX INFO: renamed from: b0, reason: from getter */
        public final SelfieCapture getLeftCapture() {
            return this.leftCapture;
        }

        @Override // zi0.g
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        /* JADX INFO: renamed from: c0, reason: from getter */
        public final SelfieCapture getRightCapture() {
            return this.rightCapture;
        }

        @Override // zi0.g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            File data;
            for (SelfieCapture selfieCapture : v.p(this.centerCapture, this.leftCapture, this.rightCapture)) {
                if (selfieCapture != null && (data = selfieCapture.getData()) != null) {
                    data.delete();
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieStepData)) {
                return false;
            }
            SelfieStepData selfieStepData = (SelfieStepData) other;
            return s.f(this.stepName, selfieStepData.stepName) && s.f(this.centerCapture, selfieStepData.centerCapture) && s.f(this.leftCapture, selfieStepData.leftCapture) && s.f(this.rightCapture, selfieStepData.rightCapture);
        }

        public int hashCode() {
            int iHashCode = this.stepName.hashCode() * 31;
            SelfieCapture selfieCapture = this.centerCapture;
            int iHashCode2 = (iHashCode + (selfieCapture == null ? 0 : selfieCapture.hashCode())) * 31;
            SelfieCapture selfieCapture2 = this.leftCapture;
            int iHashCode3 = (iHashCode2 + (selfieCapture2 == null ? 0 : selfieCapture2.hashCode())) * 31;
            SelfieCapture selfieCapture3 = this.rightCapture;
            return iHashCode3 + (selfieCapture3 != null ? selfieCapture3.hashCode() : 0);
        }

        public String toString() {
            return "SelfieStepData(stepName=" + this.stepName + ", centerCapture=" + this.centerCapture + ", leftCapture=" + this.leftCapture + ", rightCapture=" + this.rightCapture + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.stepName);
            SelfieCapture selfieCapture = this.centerCapture;
            if (selfieCapture == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieCapture.writeToParcel(dest, flags);
            }
            SelfieCapture selfieCapture2 = this.leftCapture;
            if (selfieCapture2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieCapture2.writeToParcel(dest, flags);
            }
            SelfieCapture selfieCapture3 = this.rightCapture;
            if (selfieCapture3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieCapture3.writeToParcel(dest, flags);
            }
        }
    }

    /* JADX INFO: renamed from: zi0.g$d, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lzi0/g$d;", "Lzi0/g;", "", "stepName", "", "", "componentParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Map;", "T", "()Ljava/util/Map;", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UiStepData extends g {
        public static final Parcelable.Creator<UiStepData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Object> componentParams;

        /* JADX INFO: renamed from: zi0.g$d$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UiStepData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepData createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                String string = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(UiStepData.class.getClassLoader()));
                }
                return new UiStepData(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepData[] newArray(int i11) {
                return new UiStepData[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UiStepData(String stepName, Map<String, ? extends Object> componentParams) {
            super(null);
            s.k(stepName, "stepName");
            s.k(componentParams, "componentParams");
            this.stepName = stepName;
            this.componentParams = componentParams;
        }

        public final Map<String, Object> T() {
            return this.componentParams;
        }

        @Override // zi0.g
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getStepName() {
            return this.stepName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepData)) {
                return false;
            }
            UiStepData uiStepData = (UiStepData) other;
            return s.f(this.stepName, uiStepData.stepName) && s.f(this.componentParams, uiStepData.componentParams);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.componentParams.hashCode();
        }

        public String toString() {
            return "UiStepData(stepName=" + this.stepName + ", componentParams=" + this.componentParams + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.stepName);
            Map<String, Object> map = this.componentParams;
            dest.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: c */
    public abstract String getStepName();

    private g() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
