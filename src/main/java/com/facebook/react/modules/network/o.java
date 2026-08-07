package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.r0;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/facebook/react/modules/network/o;", "", "<init>", "()V", "", "encodingType", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "fileContentUriStr", "Ljava/io/InputStream;", "h", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;", "Landroid/net/Uri;", "uri", "f", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;", "Lokhttp3/MediaType;", "mediaType", "body", "Lokhttp3/RequestBody;", DateTokenConverter.CONVERTER_KEY, "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", "Lokio/r0;", "source", "Ljn0/h0;", "b", "(Lokio/r0;)V", "inputStream", "c", "(Lokhttp3/MediaType;Ljava/io/InputStream;)Lokhttp3/RequestBody;", "requestBody", "Lcom/facebook/react/modules/network/j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/modules/network/k;", "e", "(Lokhttp3/RequestBody;Lcom/facebook/react/modules/network/j;)Lcom/facebook/react/modules/network/k;", "method", "g", "(Ljava/lang/String;)Lokhttp3/RequestBody;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f22849a = new o();

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/facebook/react/modules/network/o$a", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/i;", "sink", "Ljn0/h0;", "writeTo", "(Lokio/i;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaType f22850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f22851b;

        a(MediaType mediaType, InputStream inputStream) {
            this.f22850a = mediaType;
            this.f22851b = inputStream;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            try {
                return this.f22851b.available();
            } catch (IOException unused) {
                return 0L;
            }
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType, reason: from getter */
        public MediaType getF22850a() {
            return this.f22850a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.i sink) {
            s.k(sink, "sink");
            r0 r0VarC = null;
            try {
                r0VarC = okio.c.a().c(this.f22851b);
                sink.q2(r0VarC);
            } finally {
                if (r0VarC != null) {
                    o.f22849a.b(r0VarC);
                }
            }
        }
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(r0 source) {
        try {
            source.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final RequestBody c(MediaType mediaType, InputStream inputStream) {
        s.k(inputStream, "inputStream");
        return new a(mediaType, inputStream);
    }

    public static final RequestBody d(MediaType mediaType, String body) {
        s.k(body, "body");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = body.getBytes(p013kotlin.text.d.UTF_8);
            s.j(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            RequestBody.Companion companion = RequestBody.INSTANCE;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            s.j(byteArray, "toByteArray(...)");
            return RequestBody.Companion.create$default(companion, mediaType, byteArray, 0, 0, 12, (Object) null);
        } catch (IOException unused) {
            return null;
        }
    }

    public static final k e(RequestBody requestBody, j listener) {
        s.k(requestBody, "requestBody");
        s.k(listener, "listener");
        return new k(requestBody, listener);
    }

    private final InputStream f(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    sn0.b.a(readableByteChannelNewChannel, null);
                    sn0.b.a(inputStreamOpenStream, null);
                    sn0.b.a(fileOutputStream, null);
                    return fileInputStream;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(readableByteChannelNewChannel, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    sn0.b.a(inputStreamOpenStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                sn0.b.a(fileOutputStream, th6);
                throw th7;
            }
        }
    }

    public static final RequestBody g(String method) {
        s.k(method, "method");
        int iHashCode = method.hashCode();
        if (iHashCode == 79599 ? method.equals("PUT") : iHashCode == 2461856 ? method.equals("POST") : iHashCode == 75900968 && method.equals("PATCH")) {
            return RequestBody.INSTANCE.create((MediaType) null, okio.k.f97943e);
        }
        return null;
    }

    public static final InputStream h(Context context, String fileContentUriStr) {
        List listM;
        s.k(context, "context");
        s.k(fileContentUriStr, "fileContentUriStr");
        try {
            Uri uri = Uri.parse(fileContentUriStr);
            String scheme = uri.getScheme();
            if (scheme != null && t.b0(scheme, "http", false, 2, null)) {
                o oVar = f22849a;
                s.h(uri);
                return oVar.f(context, uri);
            }
            if (!t.b0(fileContentUriStr, "data:", false, 2, null)) {
                return context.getContentResolver().openInputStream(uri);
            }
            List<String> listM2 = new q(",").m(fileContentUriStr, 0);
            if (listM2.isEmpty()) {
                listM = v.m();
            } else {
                ListIterator<String> listIterator = listM2.listIterator(listM2.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listM = v.d1(listM2, listIterator.nextIndex() + 1);
                    }
                }
                listM = v.m();
            }
            return new ByteArrayInputStream(Base64.decode(((String[]) listM.toArray(new String[0]))[1], 0));
        } catch (Exception e11) {
            qk.a.n("ReactNative", "Could not retrieve file for contentUri " + fileContentUriStr, e11);
            return null;
        }
    }

    public static final boolean i(String encodingType) {
        return t.M("gzip", encodingType, true);
    }
}
