package com.fourthline.vision.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4233l3 implements InterfaceC4226k3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f38530c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38531d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f38532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f38533b;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.l3$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.l3$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC4226k3.a.values().length];
            try {
                iArr[InterfaceC4226k3.a.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC4226k3.a.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4233l3(File mediaFilesFolder) {
        p013kotlin.jvm.internal.s.k(mediaFilesFolder, "mediaFilesFolder");
        this.f38532a = new ArrayList();
        if (mediaFilesFolder.exists()) {
            File[] fileArrListFiles = mediaFilesFolder.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    p013kotlin.jvm.internal.s.h(file);
                    if (sn0.h.I(file, "temp_")) {
                        arrayList.add(file);
                    }
                }
                this.f38532a.addAll(arrayList);
            }
        } else {
            mediaFilesFolder.mkdirs();
        }
        this.f38533b = mediaFilesFolder;
    }

    private final void deleteAll(List<File> list) {
        for (File file : list) {
            try {
                file.delete();
            } catch (IOException unused) {
                if (list.getClass().isAnonymousClass()) {
                    String name = list.getClass().getName();
                    int length = name.length();
                    p013kotlin.jvm.internal.s.h(name);
                    if (length > 23) {
                        p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                    }
                } else {
                    String simpleName = list.getClass().getSimpleName();
                    int length2 = simpleName.length();
                    p013kotlin.jvm.internal.s.h(simpleName);
                    if (length2 > 23) {
                        p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                    }
                }
                Objects.toString(file);
            }
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        list.clear();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4226k3
    public File createResultFile(InterfaceC4226k3.a type) throws IOException {
        p013kotlin.jvm.internal.s.k(type, "type");
        int i11 = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("At the moment we don't provide separate audio files to clients");
        }
        File file = new File(this.f38533b, "video_" + UUID.randomUUID() + ".mp4");
        file.createNewFile();
        return file;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4226k3
    public File createTempFile(InterfaceC4226k3.a type) throws IOException {
        String str;
        p013kotlin.jvm.internal.s.k(type, "type");
        File file = this.f38533b;
        int i11 = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            str = "temp_video_" + UUID.randomUUID() + ".mp4";
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "temp_audio_" + UUID.randomUUID() + ".aac";
        }
        File file2 = new File(file, str);
        file2.createNewFile();
        this.f38532a.add(file2);
        return file2;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4226k3
    public void deleteTempFiles() {
        deleteAll(this.f38532a);
    }
}
