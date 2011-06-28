class Category < ActiveRecord::Base
  belongs_to :type
  belongs_to :user
  
  def initialize(description = nil)
    super
    @active = true
    @description = description
  end

end
