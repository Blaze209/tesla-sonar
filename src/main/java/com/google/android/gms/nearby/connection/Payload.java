package com.google.android.gms.nearby.connection;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.nearby.zzpo;
import com.google.android.gms.internal.nearby.zzpt;
import java.io.InputStream;
import java.util.UUID;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public class Payload {
    public static final zzpt zza = zzpt.zzn("/", "\\", "../");
    public static final zzpt zzb = zzpt.zzq("../", "/", "\\", CallerData.NA, Marker.ANY_MARKER, "\"", "<", ">", "|", ":", WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "\n", "\r", SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\f");
    public static final zzpt zzc = zzpt.zzo(CallerDataConverter.DEFAULT_RANGE_DELIMITER, ".", "\\", "/");
    public static final zzpt zzd = zzpt.zzl("\\");
    public static final zzpt zze = zzpt.zzm("../", "..\\");
    public static final zzpt zzf = zzpt.zzq(CallerData.NA, Marker.ANY_MARKER, "\"", "|", ":", WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "\n", "\r", SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\f", "../", CallerDataConverter.DEFAULT_RANGE_DELIMITER, new String[0]);
    public static final zzpt zzg = zzpt.zzl("\\");
    public static final zzpt zzh = zzpt.zzm("\\", "/");
    private final long zzi;

    @Type
    private final int zzj;
    private final byte[] zzk;
    private final File zzl;
    private final Stream zzm;
    private long zzn;
    private boolean zzo;
    private long zzp;
    private String zzq;
    private String zzr;

    public static class File {
        private final java.io.File zza;
        private final ParcelFileDescriptor zzb;
        private final long zzc;
        private final Uri zzd;

        private File(java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j11, Uri uri) {
            this.zza = file;
            this.zzb = parcelFileDescriptor;
            this.zzc = j11;
            this.zzd = uri;
        }

        @NonNull
        public static File zzb(@NonNull java.io.File file, @NonNull ParcelFileDescriptor parcelFileDescriptor, long j11, @NonNull Uri uri) {
            return new File((java.io.File) Preconditions.checkNotNull(file, "Cannot create Payload.File from null java.io.File."), (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), j11, (Uri) Preconditions.checkNotNull(uri, "Cannot create Payload.File from null Uri"));
        }

        @NonNull
        public static File zzc(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new File(null, (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), parcelFileDescriptor.getStatSize(), null);
        }

        @Deprecated
        public java.io.File asJavaFile() {
            return this.zza;
        }

        @NonNull
        public ParcelFileDescriptor asParcelFileDescriptor() {
            return (ParcelFileDescriptor) Preconditions.checkNotNull(this.zzb, "ParcelFileDescriptor is not available to the File");
        }

        public Uri asUri() {
            return this.zzd;
        }

        @Deprecated
        public void close() {
            IOUtils.closeQuietly(this.zzb);
        }

        public long getSize() {
            return this.zzc;
        }

        public final ParcelFileDescriptor zza() {
            return this.zzb;
        }
    }

    public static class Stream {
        private final ParcelFileDescriptor zza;
        private InputStream zzb;

        private Stream(ParcelFileDescriptor parcelFileDescriptor, InputStream inputStream) {
            this.zza = parcelFileDescriptor;
            this.zzb = inputStream;
        }

        @NonNull
        public static Stream zza(@NonNull InputStream inputStream) {
            Preconditions.checkNotNull(inputStream, "Cannot create Payload.Stream from null InputStream.");
            return new Stream(null, inputStream);
        }

        @NonNull
        public static Stream zzb(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            return new Stream(parcelFileDescriptor, null);
        }

        @NonNull
        public InputStream asInputStream() {
            if (this.zzb == null) {
                this.zzb = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.zza));
            }
            return this.zzb;
        }

        public ParcelFileDescriptor asParcelFileDescriptor() {
            return this.zza;
        }

        @Deprecated
        public void close() {
            IOUtils.closeQuietly(this.zza);
            IOUtils.closeQuietly(this.zzb);
        }
    }

    public @interface Type {
        public static final int BYTES = 1;
        public static final int FILE = 2;
        public static final int STREAM = 3;
    }

    private Payload(long j11, int i11, byte[] bArr, File file, Stream stream) {
        this.zzi = j11;
        this.zzj = i11;
        this.zzk = bArr;
        this.zzl = file;
        this.zzm = stream;
    }

    @NonNull
    public static Payload fromBytes(@NonNull byte[] bArr) {
        Preconditions.checkNotNull(bArr, "Cannot create a Payload from null bytes.");
        return zzb(bArr, UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    public static Payload fromFile(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        return zzc(File.zzc(parcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    public static Payload fromStream(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        return zze(Stream.zzb(parcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    public static Payload zzb(@NonNull byte[] bArr, long j11) {
        return new Payload(j11, 1, bArr, null, null);
    }

    @NonNull
    public static Payload zzc(@NonNull File file, long j11) {
        Payload payload = new Payload(j11, 2, null, file, null);
        if (file.getSize() <= 0) {
            return payload;
        }
        long size = file.getSize();
        if (size < 0) {
            throw new IllegalArgumentException("Payload size must be positive.");
        }
        if (payload.getType() != 3 && payload.getType() != 2) {
            throw new IllegalArgumentException("Payload type must be FILE or STREAM.");
        }
        if (size < payload.zzn) {
            throw new IllegalArgumentException("Payload stream size must be larger than the offset.");
        }
        payload.zzp = size;
        return payload;
    }

    @NonNull
    public static Payload zzd(@NonNull Uri uri, long j11, long j12) {
        return zzc(new File(j11, (Uri) Preconditions.checkNotNull(uri, "Cannot create Payload.File from null Uri")), j12);
    }

    @NonNull
    public static Payload zze(@NonNull Stream stream, long j11) {
        return new Payload(j11, 3, null, null, stream);
    }

    public byte[] asBytes() {
        return this.zzk;
    }

    public File asFile() {
        return this.zzl;
    }

    public Stream asStream() {
        return this.zzm;
    }

    public void close() {
        File file = this.zzl;
        if (file != null) {
            file.close();
        }
        Stream stream = this.zzm;
        if (stream != null) {
            stream.close();
        }
    }

    public long getId() {
        return this.zzi;
    }

    public long getOffset() {
        return this.zzn;
    }

    @Type
    public int getType() {
        return this.zzj;
    }

    public void setFileName(@NonNull String str) {
        if (zzpo.zzb(str)) {
            throw new IllegalArgumentException("Payload file name should not be null or empty.");
        }
        if (getType() != 2) {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
        zzpt zzptVar = zza;
        int size = zzptVar.size();
        int i11 = 0;
        while (i11 < size) {
            String str2 = (String) zzptVar.get(i11);
            i11++;
            if (str.contains(str2)) {
                throw new IllegalArgumentException("File name " + str + " contains illegal string " + str2 + ".");
            }
        }
        this.zzq = str;
    }

    public void setOffset(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("Payload offset must be positive or zero.");
        }
        if (getType() != 2 && getType() != 3) {
            throw new IllegalArgumentException("Payload offset only support FILE or STREAM type.");
        }
        File file = this.zzl;
        if (file != null && j11 >= file.getSize()) {
            throw new IllegalArgumentException("Payload offset should be smaller than the file size.");
        }
        if (getType() == 3) {
            long j12 = this.zzp;
            if (j12 > 0 && j12 <= j11) {
                throw new IllegalArgumentException("Payload offset should be smaller than the stream size.");
            }
        }
        this.zzn = j11;
    }

    public void setParentFolder(@NonNull String str) {
        if (zzpo.zzb(str)) {
            throw new IllegalArgumentException("Payload parent folder should not be null or empty.");
        }
        if (getType() != 2) {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
        zzpt zzptVar = zze;
        int size = zzptVar.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zContains = str.contains((String) zzptVar.get(i11));
            i11++;
            if (zContains) {
                throw new IllegalArgumentException("Folder name contains illegal string.");
            }
        }
        this.zzr = str;
    }

    public void setSensitive(boolean z11) {
        this.zzo = z11;
    }

    @ShowFirstParty
    public final long zza() {
        return this.zzp;
    }

    @ShowFirstParty
    public final String zzf() {
        return this.zzq;
    }

    @ShowFirstParty
    public final String zzg() {
        return this.zzr;
    }

    public final boolean zzh() {
        return this.zzo;
    }

    @NonNull
    public static Payload fromStream(@NonNull InputStream inputStream) {
        return zze(Stream.zza(inputStream), UUID.randomUUID().getLeastSignificantBits());
    }

    @NonNull
    public static Payload fromFile(@NonNull java.io.File file) {
        return zzc(File.zzb(file, ParcelFileDescriptor.open(file, 268435456), file.length(), Uri.fromFile(file)), UUID.randomUUID().getLeastSignificantBits());
    }
}
