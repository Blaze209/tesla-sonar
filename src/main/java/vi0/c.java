package vi0;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u00020\u0001:\u0004\"\u0016\u001f\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J+\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u000e2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#RT\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$0$2\u001e\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$0$8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b\"\u0010(R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010*0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lvi0/c;", "Lvi0/a;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Landroid/app/Application;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lokhttp3/OkHttpClient;Landroid/app/Application;)V", "Ljava/io/File;", "m", "()Ljava/io/File;", "", "fontUrl", "destinationFile", "Ljn0/h0;", "k", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "outState", "e", "(Landroid/os/Bundle;)V", "inState", "a", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onSuccess", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lwn0/l;)V", "", "Lvi0/g;", "remoteFonts", "b", "(Ljava/util/List;)V", "Lokhttp3/OkHttpClient;", "c", "Landroid/app/Application;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "value", "Ljava/util/Map;", "()Ljava/util/Map;", "fontDownloaderMapping", "Lvi0/c$d;", "fontCache", "", "Lvi0/c$b;", "f", "Ljava/util/List;", "onFontDownloadedCallbacks", "Lkotlinx/coroutines/CoroutineScope;", "g", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "h", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient okHttpClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Application context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, d> fontCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<b> onFontDownloadedCallbacks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lvi0/c$b;", "", "", ImagesContract.URL, "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "Ljn0/h0;", "onFontDownloaded", "<init>", "(Ljava/lang/String;Lwn0/l;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lwn0/l;", "()Lwn0/l;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final l<Typeface, h0> onFontDownloaded;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String url, l<? super Typeface, h0> onFontDownloaded) {
            s.k(url, "url");
            s.k(onFontDownloaded, "onFontDownloaded");
            this.url = url;
            this.onFontDownloaded = onFontDownloaded;
        }

        public final l<Typeface, h0> a() {
            return this.onFontDownloaded;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: renamed from: vi0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvi0/c$c;", "Landroid/os/Parcelable;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontDownloaderMapping", "<init>", "(Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C2558c implements Parcelable {
        public static final Parcelable.Creator<C2558c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

        /* JADX INFO: renamed from: vi0.c$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C2558c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2558c createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    String string = parcel.readString();
                    int i13 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        linkedHashMap2.put(StyleElements.FontWeight.valueOf(parcel.readString()), parcel.readString());
                    }
                    linkedHashMap.put(string, linkedHashMap2);
                }
                return new C2558c(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C2558c[] newArray(int i11) {
                return new C2558c[i11];
            }
        }

        public C2558c(Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping) {
            s.k(fontDownloaderMapping, "fontDownloaderMapping");
            this.fontDownloaderMapping = fontDownloaderMapping;
        }

        public final Map<String, Map<StyleElements.FontWeight, String>> a() {
            return this.fontDownloaderMapping;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            Map<String, Map<StyleElements.FontWeight, String>> map = this.fontDownloaderMapping;
            dest.writeInt(map.size());
            for (Map.Entry<String, Map<StyleElements.FontWeight, String>> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                Map<StyleElements.FontWeight, String> value = entry.getValue();
                dest.writeInt(value.size());
                for (Map.Entry<StyleElements.FontWeight, String> entry2 : value.entrySet()) {
                    dest.writeString(entry2.getKey().name());
                    dest.writeString(entry2.getValue());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lvi0/c$d;", "", "b", "a", "Lvi0/c$d$a;", "Lvi0/c$d$b;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface d {

        /* JADX INFO: renamed from: vi0.c$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvi0/c$d$a;", "Lvi0/c$d;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cached implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Typeface typeface;

            public Cached(Typeface typeface) {
                s.k(typeface, "typeface");
                this.typeface = typeface;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Typeface getTypeface() {
                return this.typeface;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cached) && s.f(this.typeface, ((Cached) other).typeface);
            }

            public int hashCode() {
                return this.typeface.hashCode();
            }

            public String toString() {
                return "Cached(typeface=" + this.typeface + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvi0/c$d$b;", "Lvi0/c$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f119502a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1662305117;
            }

            public String toString() {
                return "Downloading";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1", f = "RealFontDownloader.kt", i = {0}, l = {86, 92}, m = "invokeSuspend", n = {"fontFile"}, s = {"L$0"})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f119503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f119504o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f119506q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ l<Typeface, h0> f119507r;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1", f = "RealFontDownloader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f119508n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ l<Typeface, h0> f119509o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Typeface f119510p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ c f119511q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String f119512r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(l<? super Typeface, h0> lVar, Typeface typeface, c cVar, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f119509o = lVar;
                this.f119510p = typeface;
                this.f119511q = cVar;
                this.f119512r = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean b(String str, b bVar) {
                return s.f(bVar.getUrl(), str);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f119509o, this.f119510p, this.f119511q, this.f119512r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f119508n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                l<Typeface, h0> lVar = this.f119509o;
                Typeface typeface = this.f119510p;
                s.h(typeface);
                lVar.invoke(typeface);
                List list = this.f119511q.onFontDownloadedCallbacks;
                String str = this.f119512r;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (s.f(((b) obj2).getUrl(), str)) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = this.f119511q.onFontDownloadedCallbacks;
                final String str2 = this.f119512r;
                v.L(list2, new l() { // from class: vi0.e
                    @Override // wn0.l
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(c.e.a.b(str2, (c.b) obj3));
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l<Typeface, h0> lVarA = ((b) it.next()).a();
                    Typeface typeface2 = this.f119510p;
                    s.h(typeface2);
                    lVarA.invoke(typeface2);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, l<? super Typeface, h0> lVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f119506q = str;
            this.f119507r = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(String str, b bVar) {
            return s.f(bVar.getUrl(), str);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new e(this.f119506q, this.f119507r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r11, r4, r10) == r0) goto L19;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f119504o
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                jn0.t.b(r11)     // Catch: java.lang.Exception -> L71
                goto L8c
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                java.lang.Object r1 = r10.f119503n
                java.io.File r1 = (java.io.File) r1
                jn0.t.b(r11)     // Catch: java.lang.Exception -> L71
                goto L3c
            L24:
                jn0.t.b(r11)
                vi0.c r11 = vi0.c.this     // Catch: java.lang.Exception -> L71
                java.io.File r1 = vi0.c.i(r11)     // Catch: java.lang.Exception -> L71
                vi0.c r11 = vi0.c.this     // Catch: java.lang.Exception -> L71
                java.lang.String r5 = r10.f119506q     // Catch: java.lang.Exception -> L71
                r10.f119503n = r1     // Catch: java.lang.Exception -> L71
                r10.f119504o = r4     // Catch: java.lang.Exception -> L71
                java.lang.Object r11 = vi0.c.g(r11, r5, r1, r10)     // Catch: java.lang.Exception -> L71
                if (r11 != r0) goto L3c
                goto L70
            L3c:
                android.graphics.Typeface r6 = android.graphics.Typeface.createFromFile(r1)     // Catch: java.lang.Exception -> L71
                vi0.c r11 = vi0.c.this     // Catch: java.lang.Exception -> L71
                java.util.Map r11 = vi0.c.h(r11)     // Catch: java.lang.Exception -> L71
                java.lang.String r4 = r10.f119506q     // Catch: java.lang.Exception -> L71
                vi0.c$d$a r5 = new vi0.c$d$a     // Catch: java.lang.Exception -> L71
                p013kotlin.jvm.internal.s.h(r6)     // Catch: java.lang.Exception -> L71
                r5.<init>(r6)     // Catch: java.lang.Exception -> L71
                r11.put(r4, r5)     // Catch: java.lang.Exception -> L71
                r1.delete()     // Catch: java.lang.Exception -> L71
                kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L71
                vi0.c$e$a r4 = new vi0.c$e$a     // Catch: java.lang.Exception -> L71
                wn0.l<android.graphics.Typeface, jn0.h0> r5 = r10.f119507r     // Catch: java.lang.Exception -> L71
                vi0.c r7 = vi0.c.this     // Catch: java.lang.Exception -> L71
                java.lang.String r8 = r10.f119506q     // Catch: java.lang.Exception -> L71
                r9 = 0
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L71
                r10.f119503n = r2     // Catch: java.lang.Exception -> L71
                r10.f119504o = r3     // Catch: java.lang.Exception -> L71
                java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r4, r10)     // Catch: java.lang.Exception -> L71
                if (r11 != r0) goto L8c
            L70:
                return r0
            L71:
                vi0.c r11 = vi0.c.this
                java.util.Map r11 = vi0.c.h(r11)
                java.lang.String r0 = r10.f119506q
                r11.put(r0, r2)
                vi0.c r11 = vi0.c.this
                java.util.List r11 = vi0.c.j(r11)
                java.lang.String r0 = r10.f119506q
                vi0.d r1 = new vi0.d
                r1.<init>()
                p013kotlin.collections.v.L(r11, r1)
            L8c:
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: vi0.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader", f = "RealFontDownloader.kt", i = {0}, l = {133}, m = "downloadFontFile", n = {"destinationFile"}, s = {"L$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f119513n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f119514o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f119516q;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f119514o = obj;
            this.f119516q |= Integer.MIN_VALUE;
            return c.this.k(null, null, this);
        }
    }

    public c(OkHttpClient okHttpClient, Application context) {
        s.k(okHttpClient, "okHttpClient");
        s.k(context, "context");
        this.okHttpClient = okHttpClient;
        this.context = context;
        this.fontDownloaderMapping = new LinkedHashMap();
        this.fontCache = new LinkedHashMap();
        this.onFontDownloadedCallbacks = new ArrayList();
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, File file, Continuation<? super h0> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f119516q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f119516q = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objRunInterruptible = fVar.f119514o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f119516q;
        if (i12 == 0) {
            t.b(objRunInterruptible);
            final Request requestBuild = new Request.Builder().url(str).build();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            wn0.a aVar = new wn0.a() { // from class: vi0.b
                @Override // wn0.a
                public final Object invoke() {
                    return c.l(this.f119489a, requestBuild);
                }
            };
            fVar.f119513n = file;
            fVar.f119516q = 1;
            objRunInterruptible = InterruptibleKt.runInterruptible(io2, aVar, fVar);
            if (objRunInterruptible == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) fVar.f119513n;
            t.b(objRunInterruptible);
        }
        Response response = (Response) objRunInterruptible;
        try {
            ResponseBody responseBodyBody = response.body();
            InputStream inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (inputStreamByteStream != null) {
                    try {
                        Boxing.boxLong(sn0.a.b(inputStreamByteStream, fileOutputStream, 0, 2, null));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                sn0.b.a(fileOutputStream, null);
                sn0.b.a(inputStreamByteStream, null);
                sn0.b.a(response, null);
                return h0.f84049a;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    sn0.b.a(inputStreamByteStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                sn0.b.a(response, th6);
                throw th7;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response l(c cVar, Request request) {
        return FirebasePerfOkHttpClient.execute(cVar.okHttpClient.newCall(request));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File m() {
        File file = new File(new File(this.context.getCacheDir(), ".com.withpersona.sdk2.inquiry"), OrcaFlavourKeys.FONTS);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, UUID.randomUUID().toString());
    }

    @Override // vi0.a
    public void a(Bundle inState) {
        Map<String, Map<StyleElements.FontWeight, String>> linkedHashMap;
        C2558c c2558c;
        if (inState == null || (c2558c = (C2558c) q5.c.a(inState, "font_downloader_mapping", C2558c.class)) == null || (linkedHashMap = c2558c.a()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.fontDownloaderMapping = linkedHashMap;
    }

    @Override // vi0.a
    public void b(List<g> remoteFonts) {
        if (remoteFonts == null) {
            remoteFonts = v.m();
        }
        for (g gVar : remoteFonts) {
            String fontFamilyName = gVar.getFontFamilyName();
            String str = gVar.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String();
            StyleElements.FontWeight fontWeight = gVar.getFontWeight();
            if (fontFamilyName != null && str != null && fontWeight != null) {
                Map<String, Map<StyleElements.FontWeight, String>> mapC = c();
                Map<StyleElements.FontWeight, String> linkedHashMap = mapC.get(fontFamilyName);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    mapC.put(fontFamilyName, linkedHashMap);
                }
                linkedHashMap.put(fontWeight, str);
            }
        }
    }

    @Override // vi0.a
    public Map<String, Map<StyleElements.FontWeight, String>> c() {
        return this.fontDownloaderMapping;
    }

    @Override // vi0.a
    public void d(String fontUrl, l<? super Typeface, h0> onSuccess) {
        s.k(fontUrl, "fontUrl");
        s.k(onSuccess, "onSuccess");
        d dVar = this.fontCache.get(fontUrl);
        if (dVar instanceof d.Cached) {
            onSuccess.invoke(((d.Cached) dVar).getTypeface());
            return;
        }
        d.b bVar = d.b.f119502a;
        if (s.f(dVar, bVar)) {
            this.onFontDownloadedCallbacks.add(new b(fontUrl, onSuccess));
        } else {
            if (dVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            this.fontCache.put(fontUrl, bVar);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new e(fontUrl, onSuccess, null), 3, null);
        }
    }

    @Override // vi0.a
    public void e(Bundle outState) {
        s.k(outState, "outState");
        outState.putParcelable("font_downloader_mapping", new C2558c(c()));
    }
}
