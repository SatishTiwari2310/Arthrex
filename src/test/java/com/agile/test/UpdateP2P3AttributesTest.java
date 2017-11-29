package com.agile.test;

import org.junit.Test;

import com.agile.api.IAgileSession;
import com.agile.api.IDataObject;
import com.agile.api.INode;
import com.agile.px.ActionResult;
import com.agile.test.UpdateP2P3Attributes;

import junit.framework.Assert;
import junit.framework.TestCase;

public class UpdateP2P3AttributesTest  extends TestCase
{




 @Test  
public void testGetHello()
{
    Assert.assertEquals(UpdateP2P3Attributes.getHello(),"Hello");
    
}


/*@Test
public void testDoAction(IAgileSession session, INode actionNode, IDataObject object)
    {
    	ActionResult outcome = null;
    	outcome=new UpdateP2P3Attributes().doAction(session, actionNode, object);
    	assertNotNull(outcome);
    }*/

@Test
public void testDoAction()
{
	UpdateP2P3Attributes UpdateP2P3AttributesObj = new UpdateP2P3Attributes();
	ActionResult outcome = UpdateP2P3AttributesObj.doAction(null, null, null);
	Assert.assertNull(outcome);
	
}



}
