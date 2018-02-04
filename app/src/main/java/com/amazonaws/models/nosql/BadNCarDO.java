package com.amazonaws.models.nosql;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@DynamoDBTable(tableName = "badncar-mobilehub-780006875-BadNCar")

public class BadNCarDO {
    private String _userId;
    private String _badcarnumber;
    private String _comment;

    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBAttribute(attributeName = "userId")
    public String getUserId() {
        return _userId;
    }

    public void setUserId(final String _userId) {
        this._userId = _userId;
    }
    @DynamoDBAttribute(attributeName = "badcarnumber")
    public String getBadcarnumber() {
        return _badcarnumber;
    }

    public void setBadcarnumber(final String _badcarnumber) {
        this._badcarnumber = _badcarnumber;
    }
    @DynamoDBAttribute(attributeName = "comment")
    public String getComment() {
        return _comment;
    }

    public void setComment(final String _comment) {
        this._comment = _comment;
    }

}
