if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {

result = SUCCESS;
BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
session.put("login_user_id"

,loginDTO.getLoginId());

session.put("id"

, buyItemDTO.getId());

session.put("buyItem_name"

, buyItemDTO.getItemName());

session.put("buyItem_price"

,
}
