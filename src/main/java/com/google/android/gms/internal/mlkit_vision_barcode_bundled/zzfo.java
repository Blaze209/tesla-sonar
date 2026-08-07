package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzfo {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzfm zzfmVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzfmVar, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzc(i11, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i12 = 1; i12 < str.length(); i12++) {
                char cCharAt = str.charAt(i12);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzgq.zza(new zzde(((String) obj).getBytes(zzep.zza))));
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzdf) {
            sb2.append(": \"");
            sb2.append(zzgq.zza((zzdf) obj));
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzeh) {
            sb2.append(" {");
            zzd((zzeh) obj, sb2, i11 + 2);
            sb2.append("\n");
            zzc(i11, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i13 = i11 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i13, Action.KEY_ATTRIBUTE, entry.getKey());
        zzb(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        zzc(i11, sb2);
        sb2.append("}");
    }

    private static void zzc(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(zza, 0, i12);
            i11 -= i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzd(zzfm zzfmVar, StringBuilder sb2, int i11) {
        int i12;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i12 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i12);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i11, strSubstring.substring(0, strSubstring.length() - 4), zzeh.zzR(method2, zzfmVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i11, strSubstring.substring(0, strSubstring.length() - 3), zzeh.zzR(method, zzfmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzR = zzeh.zzR(method4, zzfmVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzR instanceof Boolean) {
                            if (((Boolean) objZzR).booleanValue()) {
                                zzb(sb2, i11, strSubstring, objZzR);
                            }
                        } else if (objZzR instanceof Integer) {
                            if (((Integer) objZzR).intValue() != 0) {
                                zzb(sb2, i11, strSubstring, objZzR);
                            }
                        } else if (objZzR instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzR).floatValue()) != 0) {
                                zzb(sb2, i11, strSubstring, objZzR);
                            }
                        } else if (!(objZzR instanceof Double)) {
                            if (objZzR instanceof String) {
                                zEquals = objZzR.equals("");
                            } else if (objZzR instanceof zzdf) {
                                zEquals = objZzR.equals(zzdf.zzb);
                            } else if (objZzR instanceof zzfm) {
                                if (objZzR != ((zzfm) objZzR).zzac()) {
                                    zzb(sb2, i11, strSubstring, objZzR);
                                }
                            } else if (!(objZzR instanceof Enum) || ((Enum) objZzR).ordinal() != 0) {
                                zzb(sb2, i11, strSubstring, objZzR);
                            }
                            if (!zEquals) {
                                zzb(sb2, i11, strSubstring, objZzR);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzR).doubleValue()) != 0) {
                            zzb(sb2, i11, strSubstring, objZzR);
                        }
                    } else if (((Boolean) zzeh.zzR(method5, zzfmVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i11, strSubstring, objZzR);
                    }
                }
            }
            i12 = 3;
        }
        if (zzfmVar instanceof zzed) {
            Iterator itZzf = ((zzed) zzfmVar).zzb.zzf();
            while (itZzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzf.next();
                zzb(sb2, i11, "[" + ((zzee) entry2.getKey()).zza + "]", entry2.getValue());
            }
        }
        zzgt zzgtVar = ((zzeh) zzfmVar).zzc;
        if (zzgtVar != null) {
            zzgtVar.zzi(sb2, i11);
        }
    }
}
