package ig0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.IndexedValue;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import rc.ImageRequest;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u00105\u001a\u0004\b6\u00107R\u001c\u0010;\u001a\n 9*\u0004\u0018\u000108088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010:R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010<R0\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lig0/x;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lec/r;", "imageLoader", "Lkotlin/Function0;", "Ljn0/h0;", "onClickAddButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Landroid/content/Context;Lec/r;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "", "addButtonEnabled", "", "Lig0/d;", "documents", "Lig0/x$a;", "e", "(ZLjava/util/List;)Ljava/util/List;", "Ljg0/d;", "binding", DateTokenConverter.CONVERTER_KEY, "(Ljg0/d;)V", "Ljg0/b;", "c", "(Ljg0/b;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$g0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$g0;I)V", "getItemCount", "()I", IntegerTokenConverter.CONVERTER_KEY, "(ZLjava/util/List;)V", "a", "Lec/r;", "getImageLoader", "()Lec/r;", "b", "Lwn0/a;", "getOnClickAddButton", "()Lwn0/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "inflater", "Ljava/util/List;", "items", "Lkotlin/Function1;", "f", "Lwn0/l;", "getRemoveDocument", "()Lwn0/l;", "h", "(Lwn0/l;)V", "removeDocument", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ec.r imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onClickAddButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StepStyles.DocumentStepStyle styles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LayoutInflater inflater;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<? extends a> items;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super d, jn0.h0> removeDocument;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lig0/x$a;", "", "<init>", "()V", "b", "a", "Lig0/x$a$a;", "Lig0/x$a$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: ig0.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lig0/x$a$a;", "Lig0/x$a;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1650a extends a {
            public C1650a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lig0/x$a$b;", "Lig0/x$a;", "<init>", "()V", "Lig0/d;", "a", "()Lig0/d;", "document", "b", "Lig0/x$a$b$a;", "Lig0/x$a$b$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class b extends a {

            /* JADX INFO: renamed from: ig0.x$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lig0/x$a$b$a;", "Lig0/x$a$b;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lig0/d$a;", "document", "", "mimeType", "<init>", "(Ljava/io/File;Lig0/d$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "c", "()Ljava/io/File;", "b", "Lig0/d$a;", "()Lig0/d$a;", "Ljava/lang/String;", "getMimeType", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Local extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final File file;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final d.Local document;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final String mimeType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Local(File file, d.Local document, String str) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(file, "file");
                    p013kotlin.jvm.internal.s.k(document, "document");
                    this.file = file;
                    this.document = document;
                    this.mimeType = str;
                }

                @Override // ig0.x.a.b
                /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
                public d.Local a() {
                    return this.document;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final File getFile() {
                    return this.file;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Local)) {
                        return false;
                    }
                    Local local = (Local) other;
                    return p013kotlin.jvm.internal.s.f(this.file, local.file) && p013kotlin.jvm.internal.s.f(this.document, local.document) && p013kotlin.jvm.internal.s.f(this.mimeType, local.mimeType);
                }

                public int hashCode() {
                    int iHashCode = ((this.file.hashCode() * 31) + this.document.hashCode()) * 31;
                    String str = this.mimeType;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Local(file=" + this.file + ", document=" + this.document + ", mimeType=" + this.mimeType + ")";
                }
            }

            /* JADX INFO: renamed from: ig0.x$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lig0/x$a$b$b;", "Lig0/x$a$b;", "", "remoteUrl", "filename", "Lig0/d$b;", "document", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lig0/d$b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "Lig0/d$b;", "()Lig0/d$b;", DateTokenConverter.CONVERTER_KEY, "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Remote extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String remoteUrl;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final String filename;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final d.Remote document;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final String mimeType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Remote(String remoteUrl, String str, d.Remote document, String str2) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(remoteUrl, "remoteUrl");
                    p013kotlin.jvm.internal.s.k(document, "document");
                    this.remoteUrl = remoteUrl;
                    this.filename = str;
                    this.document = document;
                    this.mimeType = str2;
                }

                @Override // ig0.x.a.b
                /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
                public d.Remote a() {
                    return this.document;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getFilename() {
                    return this.filename;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public String getMimeType() {
                    return this.mimeType;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final String getRemoteUrl() {
                    return this.remoteUrl;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Remote)) {
                        return false;
                    }
                    Remote remote = (Remote) other;
                    return p013kotlin.jvm.internal.s.f(this.remoteUrl, remote.remoteUrl) && p013kotlin.jvm.internal.s.f(this.filename, remote.filename) && p013kotlin.jvm.internal.s.f(this.document, remote.document) && p013kotlin.jvm.internal.s.f(this.mimeType, remote.mimeType);
                }

                public int hashCode() {
                    int iHashCode = this.remoteUrl.hashCode() * 31;
                    String str = this.filename;
                    int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.document.hashCode()) * 31;
                    String str2 = this.mimeType;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Remote(remoteUrl=" + this.remoteUrl + ", filename=" + this.filename + ", document=" + this.document + ", mimeType=" + this.mimeType + ")";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract d a();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"ig0/x$b", "Landroidx/recyclerview/widget/h$b;", "", "e", "()I", DateTokenConverter.CONVERTER_KEY, "oldItemPosition", "newItemPosition", "", "b", "(II)Z", "a", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends androidx.recyclerview.widget.h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<a> f78034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<a> f78035b;

        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends a> list, List<? extends a> list2) {
            this.f78034a = list;
            this.f78035b = list2;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean a(int oldItemPosition, int newItemPosition) {
            boolean zF;
            a aVar = this.f78034a.get(oldItemPosition);
            a aVar2 = this.f78035b.get(newItemPosition);
            if (!b(oldItemPosition, newItemPosition)) {
                return false;
            }
            if (aVar instanceof a.C1650a) {
                zF = p013kotlin.jvm.internal.s.f(aVar, aVar2);
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                zF = true;
            }
            return zF;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean b(int oldItemPosition, int newItemPosition) {
            a aVar = this.f78034a.get(oldItemPosition);
            a aVar2 = this.f78035b.get(newItemPosition);
            if (aVar.getClass() != aVar2.getClass()) {
                return false;
            }
            if (aVar instanceof a.C1650a) {
                return true;
            }
            if (aVar instanceof a.b.Local) {
                String absolutePath = ((a.b.Local) aVar).getFile().getAbsolutePath();
                p013kotlin.jvm.internal.s.i(aVar2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Local");
                return p013kotlin.jvm.internal.s.f(absolutePath, ((a.b.Local) aVar2).getFile().getAbsolutePath());
            }
            if (!(aVar instanceof a.b.Remote)) {
                throw new NoWhenBranchMatchedException();
            }
            String remoteUrl = ((a.b.Remote) aVar).getRemoteUrl();
            p013kotlin.jvm.internal.s.i(aVar2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Remote");
            return p013kotlin.jvm.internal.s.f(remoteUrl, ((a.b.Remote) aVar2).getRemoteUrl());
        }

        @Override // androidx.recyclerview.widget.h.b
        public int d() {
            return this.f78035b.size();
        }

        @Override // androidx.recyclerview.widget.h.b
        public int e() {
            return this.f78034a.size();
        }
    }

    public x(Context context, ec.r imageLoader, wn0.a<jn0.h0> onClickAddButton, StepStyles.DocumentStepStyle documentStepStyle) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        p013kotlin.jvm.internal.s.k(onClickAddButton, "onClickAddButton");
        this.imageLoader = imageLoader;
        this.onClickAddButton = onClickAddButton;
        this.styles = documentStepStyle;
        this.inflater = LayoutInflater.from(context);
        this.items = p013kotlin.collections.v.m();
    }

    private final void c(jg0.b binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Double imagePreviewBorderRadius = documentStepStyle.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.f83705c.setRadius((float) yh0.h.a(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.f83705c.setStrokeWidth((int) Math.ceil(yh0.h.a(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.f83705c.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.f83704b.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView addButton = binding.f83704b;
        p013kotlin.jvm.internal.s.j(addButton, "addButton");
        ui0.g.g(addButton, this.styles.getImagePreviewPlusIconStrokeColor(), this.styles.getImagePreviewPlusIconFillColor(), null, new String[]{"#FFFFFF"}, new String[]{"#5B3FD3"}, new String[0]);
    }

    private final void d(jg0.d binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
        if (strokeColorValue != null) {
            binding.f83721f.setIndicatorColor(strokeColorValue.intValue());
        }
        Integer fillColorValue = this.styles.getFillColorValue();
        if (fillColorValue != null) {
            binding.f83721f.setTrackColor(fillColorValue.intValue());
        }
        Integer imagePreviewCropAreaFillColor = this.styles.getImagePreviewCropAreaFillColor();
        if (imagePreviewCropAreaFillColor != null) {
            binding.f83719d.setBackgroundColor(imagePreviewCropAreaFillColor.intValue());
        }
        Double imagePreviewBorderRadius = this.styles.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.f83717b.setRadius((float) yh0.h.a(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.f83717b.setStrokeWidth((int) Math.ceil(yh0.h.a(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.f83717b.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        TextBasedComponentStyle imageNameStyleValue = this.styles.getImageNameStyleValue();
        if (imageNameStyleValue != null) {
            TextView filenameView = binding.f83718c;
            p013kotlin.jvm.internal.s.j(filenameView, "filenameView");
            ui0.e0.n(filenameView, imageNameStyleValue, null, 2, null);
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.f83720e.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView removeButton = binding.f83722g;
        p013kotlin.jvm.internal.s.j(removeButton, "removeButton");
        ui0.g.g(removeButton, this.styles.getImagePreviewXIconStrokeColor(), this.styles.getImagePreviewXIconFillColor(), null, new String[]{"#6B6D82"}, new String[]{"#FFFFFF"}, new String[0]);
    }

    private final List<a> e(boolean addButtonEnabled, List<? extends d> documents) {
        a remote;
        ArrayList arrayList = new ArrayList();
        for (d dVar : documents) {
            if (dVar instanceof d.Local) {
                d.Local local = (d.Local) dVar;
                File file = new File(local.getAbsoluteFilePath());
                remote = new a.b.Local(file, local, MimeTypeMap.getSingleton().getMimeTypeFromExtension(sn0.h.C(file)));
            } else {
                if (!(dVar instanceof d.Remote)) {
                    throw new NoWhenBranchMatchedException();
                }
                d.Remote remote2 = (d.Remote) dVar;
                remote = new a.b.Remote(remote2.getRemoteUrl(), remote2.getFilename(), remote2, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(remote2.getRemoteUrl())));
            }
            arrayList.add(remote);
        }
        if (addButtonEnabled) {
            arrayList.add(new a.C1650a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(x xVar, View view) {
        xVar.onClickAddButton.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(x xVar, a aVar, View view) {
        wn0.l<? super d, jn0.h0> lVar = xVar.removeDocument;
        if (lVar != null) {
            lVar.invoke(((a.b) aVar).a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int position) {
        a aVar = this.items.get(position);
        if (aVar instanceof a.C1650a) {
            return z2.f78071c;
        }
        if (aVar instanceof a.b) {
            return z2.f78072d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void h(wn0.l<? super d, jn0.h0> lVar) {
        this.removeDocument = lVar;
    }

    public final void i(boolean addButtonEnabled, List<? extends d> documents) {
        p013kotlin.jvm.internal.s.k(documents, "documents");
        List<a> listE = e(addButtonEnabled, documents);
        List<? extends a> list = this.items;
        androidx.recyclerview.widget.h.e eVarB = androidx.recyclerview.widget.h.b(new b(list, listE));
        p013kotlin.jvm.internal.s.j(eVarB, "calculateDiff(...)");
        this.items = listE;
        eVarB.c(this);
        List<? extends a> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(obj, (a) obj);
        }
        for (IndexedValue indexedValue : p013kotlin.collections.v.t1(listE)) {
            int index = indexedValue.getIndex();
            a aVar = (a) indexedValue.b();
            a aVar2 = (a) linkedHashMap.get(aVar);
            if ((aVar2 instanceof a.b.Local) && (aVar instanceof a.b.Local)) {
                a.b.Local local = (a.b.Local) aVar;
                if (((a.b.Local) aVar2).a().getUploadProgress() != local.a().getUploadProgress()) {
                    if (local.a().getUploadProgress() == 100) {
                        notifyItemChanged(index);
                    } else {
                        notifyItemChanged(index, jn0.h0.f84049a);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 holder, int position) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        final a aVar = this.items.get(position);
        if (aVar instanceof a.C1650a) {
            ((jg0.b) yh0.c0.a(holder)).f83704b.setOnClickListener(new View.OnClickListener() { // from class: ig0.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x.f(this.f77993a, view);
                }
            });
            return;
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        jg0.d dVar = (jg0.d) yh0.c0.a(holder);
        dVar.f83722g.setOnClickListener(new View.OnClickListener() { // from class: ig0.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.g(this.f78016a, aVar, view);
            }
        });
        ImageView imageView = dVar.f83719d;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        yc.c.a(imageView);
        dVar.f83719d.setImageDrawable(null);
        a.b bVar = (a.b) aVar;
        if (bVar instanceof a.b.Local) {
            a.b.Local local = (a.b.Local) aVar;
            dVar.f83719d.setVisibility(local.a().getUploadProgress() < 100 ? 4 : 0);
            dVar.f83722g.setVisibility(8);
            dVar.f83718c.setText(local.getFile().getName());
            dVar.f83721f.setVisibility(local.a().getUploadProgress() < 100 ? 0 : 8);
            dVar.f83721f.setProgress(local.a().getUploadProgress());
            return;
        }
        if (!(bVar instanceof a.b.Remote)) {
            throw new NoWhenBranchMatchedException();
        }
        dVar.f83719d.setVisibility(0);
        a.b.Remote remote = (a.b.Remote) aVar;
        if (p013kotlin.jvm.internal.s.f(remote.getMimeType(), "application/pdf")) {
            ImageView imageView2 = dVar.f83719d;
            p013kotlin.jvm.internal.s.j(imageView2, "imageView");
            Integer numValueOf = Integer.valueOf(yh0.l.f125525l);
            ec.r rVar = this.imageLoader;
            ImageRequest.a aVarO = rc.i.o(new ImageRequest.a(imageView2.getContext()).c(numValueOf), imageView2);
            aVarO.m(100, 100);
            rVar.b(aVarO.b());
        } else {
            ImageView imageView3 = dVar.f83719d;
            p013kotlin.jvm.internal.s.j(imageView3, "imageView");
            String remoteUrl = remote.getRemoteUrl();
            ec.r rVar2 = this.imageLoader;
            ImageRequest.a aVarO2 = rc.i.o(new ImageRequest.a(imageView3.getContext()).c(remoteUrl), imageView3);
            rc.h.b(aVarO2, true);
            rc.i.b(aVarO2, 100);
            aVarO2.m(500, 500);
            rVar2.b(aVarO2.b());
        }
        dVar.f83721f.setVisibility(8);
        dVar.f83722g.setVisibility(0);
        dVar.f83718c.setText(remote.getFilename());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup parent, int viewType) {
        tf.i iVarB;
        tf.i iVarB2;
        p013kotlin.jvm.internal.s.k(parent, "parent");
        View viewInflate = this.inflater.inflate(viewType, parent, false);
        if (viewType == z2.f78071c) {
            jg0.b bVarA = jg0.b.a(viewInflate);
            p013kotlin.jvm.internal.s.j(bVarA, "bind(...)");
            yh0.b0 b0Var = new yh0.b0(bVarA);
            tf.e0<tf.i> e0VarF = tf.u.F(((jg0.b) b0Var.a()).getRoot().getContext(), a3.f77689a);
            if (e0VarF != null && (iVarB2 = e0VarF.b()) != null) {
                ((jg0.b) b0Var.a()).f83704b.setComposition(iVarB2);
            }
            gb.a aVarA = b0Var.a();
            p013kotlin.jvm.internal.s.j(aVarA, "<get-binding>(...)");
            c((jg0.b) aVarA);
            return b0Var;
        }
        if (viewType != z2.f78072d) {
            throw new IllegalStateException(("Unknown view type " + viewType).toString());
        }
        jg0.d dVarA = jg0.d.a(viewInflate);
        p013kotlin.jvm.internal.s.j(dVarA, "bind(...)");
        yh0.b0 b0Var2 = new yh0.b0(dVarA);
        tf.e0<tf.i> e0VarF2 = tf.u.F(((jg0.d) b0Var2.a()).getRoot().getContext(), a3.f77690b);
        if (e0VarF2 != null && (iVarB = e0VarF2.b()) != null) {
            ((jg0.d) b0Var2.a()).f83722g.setComposition(iVarB);
        }
        gb.a aVarA2 = b0Var2.a();
        p013kotlin.jvm.internal.s.j(aVarA2, "<get-binding>(...)");
        d((jg0.d) aVarA2);
        return b0Var2;
    }
}
