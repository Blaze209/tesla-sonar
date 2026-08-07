package com.google.android.libraries.places.internal;

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
final class zzagi {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzagg zzaggVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzaggVar, sb2, 0);
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
            sb2.append(zzahg.zza(zzaed.zzl((String) obj)));
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzaed) {
            sb2.append(": \"");
            sb2.append(zzahg.zza((zzaed) obj));
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzaey) {
            sb2.append(" {");
            zzd((zzaey) obj, sb2, i11 + 2);
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
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i11 + 2;
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
    private static void zzd(zzagg zzaggVar, StringBuilder sb2, int i11) {
        int i12;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzaggVar.getClass().getDeclaredMethods();
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
                zzb(sb2, i11, strSubstring.substring(0, strSubstring.length() - 4), zzaey.zzE(method2, zzaggVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i11, strSubstring.substring(0, strSubstring.length() - 3), zzaey.zzE(method, zzaggVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzE = zzaey.zzE(method4, zzaggVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzE instanceof Boolean) {
                            if (((Boolean) objZzE).booleanValue()) {
                                zzb(sb2, i11, strSubstring, objZzE);
                            }
                        } else if (objZzE instanceof Integer) {
                            if (((Integer) objZzE).intValue() != 0) {
                                zzb(sb2, i11, strSubstring, objZzE);
                            }
                        } else if (objZzE instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzE).floatValue()) != 0) {
                                zzb(sb2, i11, strSubstring, objZzE);
                            }
                        } else if (!(objZzE instanceof Double)) {
                            if (objZzE instanceof String) {
                                zEquals = objZzE.equals("");
                            } else if (objZzE instanceof zzaed) {
                                zEquals = objZzE.equals(zzaed.zzb);
                            } else if (objZzE instanceof zzagg) {
                                if (objZzE != ((zzagg) objZzE).zzt()) {
                                    zzb(sb2, i11, strSubstring, objZzE);
                                }
                            } else if (!(objZzE instanceof Enum) || ((Enum) objZzE).ordinal() != 0) {
                                zzb(sb2, i11, strSubstring, objZzE);
                            }
                            if (!zEquals) {
                                zzb(sb2, i11, strSubstring, objZzE);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzE).doubleValue()) != 0) {
                            zzb(sb2, i11, strSubstring, objZzE);
                        }
                    } else if (((Boolean) zzaey.zzE(method5, zzaggVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i11, strSubstring, objZzE);
                    }
                }
            }
            i12 = 3;
        }
        if (zzaggVar instanceof zzaew) {
            throw null;
        }
        zzahj zzahjVar = ((zzaey) zzaggVar).zzc;
        if (zzahjVar != null) {
            zzahjVar.zzg(sb2, i11);
        }
    }
}
