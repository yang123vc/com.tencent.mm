package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.e.a;

public final class c$a
  extends a
{
  public WXMediaMessage kuy;
  public int scene;
  
  public c$a() {}
  
  public c$a(Bundle paramBundle)
  {
    o(paramBundle);
  }
  
  public final int getType()
  {
    return 2;
  }
  
  public final void n(Bundle paramBundle)
  {
    super.n(paramBundle);
    paramBundle.putAll(WXMediaMessage.a.b(kuy));
    paramBundle.putInt("_wxapi_sendmessagetowx_req_scene", scene);
  }
  
  public final void o(Bundle paramBundle)
  {
    super.o(paramBundle);
    kuy = WXMediaMessage.a.P(paramBundle);
    scene = paramBundle.getInt("_wxapi_sendmessagetowx_req_scene");
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */