package com.wheejuni.haksik;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.json.*;
import org.json.simple.*;
import org.json.simple.parser.*;


public class KeyboardSet implements RequestHandler<JSONObject, JSONObject> {

    @Override
    public JSONObject handleRequest(JSONObject input, Context context) {
        context.getLogger().log("Input: " + input);

       	JSONObject selectList = new JSONObject();
       	JSONArray cafList = new JSONArray();
       	
       	cafList.add("�ι����Ĵ�");
       	cafList.add("����ȸ���Ĵ�");
       	cafList.add("��ī�̶����");
       	
       	selectList.put("type", "buttons");
       	selectList.put("buttons", cafList);
       	
        return selectList;
    }

}
