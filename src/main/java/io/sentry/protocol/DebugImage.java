package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class DebugImage implements a2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public static final class a implements q1<DebugImage> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(i3 i3Var, ILogger iLogger) {
            DebugImage debugImage = new DebugImage();
            i3Var.h();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "debug_file":
                        debugImage.debugFile = i3Var.a1();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = i3Var.a1();
                        break;
                    case "image_size":
                        debugImage.imageSize = i3Var.R2();
                        break;
                    case "code_file":
                        debugImage.codeFile = i3Var.a1();
                        break;
                    case "arch":
                        debugImage.arch = i3Var.a1();
                        break;
                    case "type":
                        debugImage.type = i3Var.a1();
                        break;
                    case "uuid":
                        debugImage.uuid = i3Var.a1();
                        break;
                    case "debug_id":
                        debugImage.debugId = i3Var.a1();
                        break;
                    case "code_id":
                        debugImage.codeId = i3Var.a1();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        i3Var.a3(iLogger, map, strL);
                        break;
                }
            }
            i3Var.j();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.uuid != null) {
            j3Var.N("uuid").w(this.uuid);
        }
        if (this.type != null) {
            j3Var.N("type").w(this.type);
        }
        if (this.debugId != null) {
            j3Var.N("debug_id").w(this.debugId);
        }
        if (this.debugFile != null) {
            j3Var.N("debug_file").w(this.debugFile);
        }
        if (this.codeId != null) {
            j3Var.N("code_id").w(this.codeId);
        }
        if (this.codeFile != null) {
            j3Var.N("code_file").w(this.codeFile);
        }
        if (this.imageAddr != null) {
            j3Var.N("image_addr").w(this.imageAddr);
        }
        if (this.imageSize != null) {
            j3Var.N("image_size").U(this.imageSize);
        }
        if (this.arch != null) {
            j3Var.N("arch").w(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.unknown.get(str));
            }
        }
        j3Var.j();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l11) {
        this.imageSize = l11;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j11) {
        this.imageSize = Long.valueOf(j11);
    }
}
