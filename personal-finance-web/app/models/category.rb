class Category < ActiveRecord::Base
	belongs_to :type
	belongs_to :user
  
	def initialize(description = nil)
		super
		self.active = true
		self.description = description
	end

end
