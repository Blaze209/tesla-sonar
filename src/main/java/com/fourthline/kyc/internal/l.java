package com.fourthline.kyc.internal;

import com.fourthline.kyc.zipper.ZipperError;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.UUID;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24434b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f24435a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(File zipFilesFolder) {
        s.k(zipFilesFolder, "zipFilesFolder");
        this.f24435a = zipFilesFolder;
    }

    public final URI a(InputStream inputStream, UUID zipUuid) throws ZipperError.ZipExceedMaximumSize, ZipperError.NotEnoughSpace {
        s.k(inputStream, "inputStream");
        s.k(zipUuid, "zipUuid");
        File file = new File(this.f24435a, "kyc" + zipUuid + ".zip");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                sn0.a.b(inputStream, fileOutputStream, 0, 2, null);
                sn0.b.a(fileOutputStream, null);
                if (file.length() > 209715200) {
                    throw ZipperError.ZipExceedMaximumSize.INSTANCE;
                }
                URI uri = file.toURI();
                s.j(uri, "with(...)");
                return uri;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            file.delete();
            throw ZipperError.NotEnoughSpace.INSTANCE;
        }
    }

    public static /* synthetic */ URI a(l lVar, byte[] bArr, UUID uuid, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            uuid = UUID.randomUUID();
        }
        return lVar.a(bArr, uuid);
    }

    public final URI a(byte[] data, UUID zipUuid) {
        s.k(data, "data");
        s.k(zipUuid, "zipUuid");
        return a(new ByteArrayInputStream(data), zipUuid);
    }
}
